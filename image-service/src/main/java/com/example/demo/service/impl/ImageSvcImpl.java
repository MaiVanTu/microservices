package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ImageRepository;
import com.example.demo.entity.Image;
import com.example.demo.service.ImageSvc;

@Component
public class ImageSvcImpl implements ImageSvc{
	
	@Autowired
	ImageRepository imageRepository;

	@Override
	public List<Image> getAllImage() {
		return imageRepository.findAll();
	}

	@Override
	public void saveImage(Image image) {
		imageRepository.save(image);
	}

}
