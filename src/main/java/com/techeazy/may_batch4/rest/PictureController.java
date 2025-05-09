package com.techeazy.may_batch4.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techeazy.may_batch4.model.Picture;
import com.techeazy.may_batch4.service.PictureService;

@RestController
@RequestMapping("/api/picture")
public class PictureController {

	@Autowired
	PictureService pictureService;

	@GetMapping
	public List<Picture> getPictures() {
		// Get all picture
		// return "Hello from Spring Boot!";
		return pictureService.getPictures();

	}

	@PostMapping
	public void savePicture(Picture picture) {
		// Save a picture
		// return "Hello from Spring Boot!";
		pictureService.save(picture);
	}
}