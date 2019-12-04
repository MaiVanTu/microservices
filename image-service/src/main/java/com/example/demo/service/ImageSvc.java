package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Image;

@Service
public interface ImageSvc {
	List<Image> getAllImage();
	void saveImage(Image image);
}
