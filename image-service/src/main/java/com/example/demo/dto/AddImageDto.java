package com.example.demo.dto;

import org.springframework.web.multipart.MultipartFile;

public class AddImageDto { 

    private Integer id;
	
    private String name;  
	
    private MultipartFile urlS3;
	
    private String gallery;
	
	public AddImageDto() {
	}
	
	public AddImageDto(Integer id, String gallery, String name, MultipartFile urlS3) {
		super();
		this.id = id;
		this.name = name;
		this.urlS3 = urlS3;
		this.gallery = gallery;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MultipartFile getUrlS3() {
		return urlS3;
	}

	public void setUrlS3(MultipartFile urlS3) {
		this.urlS3 = urlS3;
	}

	public String getGallery() {
		return gallery;
	}

	public void setGallery(String gallery) {
		this.gallery = gallery;
	}

}
