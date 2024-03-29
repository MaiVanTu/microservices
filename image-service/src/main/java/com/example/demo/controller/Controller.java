package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AddImageDto;
import com.example.demo.entity.Image;
import com.example.demo.service.ImageSvc;

@RestController
@RequestMapping("/")
public class Controller {
	@Autowired
	private ImageSvc imageSvc;

	@RequestMapping("/")
	public String home() {
		return null;
	}

	@RequestMapping("/images")
	public List<Image> getImages() {
		return imageSvc.getAllImage();
	}

	@RequestMapping(value="/image/add", method=RequestMethod.POST, consumes = {"multipart/form-data"})
	public HttpStatus addImage(@ModelAttribute AddImageDto addImageDto) {
		System.out.println(addImageDto);
		
//		imageSvc.saveImage(addImageDto);
		return HttpStatus.OK;
	}
}