package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Image;

public interface ImageRepository extends CrudRepository<Image, Long>{
	List<Image> findAll();
}
