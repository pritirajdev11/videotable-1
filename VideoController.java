package com.example.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.VideoDetailsDTO;
import com.example.model.Video;
import com.example.service.VideoService;

@RestController
//@RequestMapping("/videos")

public class VideoController {

	@Autowired
	private VideoService videoService;

	@PostMapping("/videos")
	public String addVideo(@RequestBody Video video) {
		videoService.addVideo(video);
		return "success";
	}

	@GetMapping("/video/{id}")
	public ResponseEntity<VideoDetailsDTO> getVideoDetailsById(@PathVariable Long id) {
		Optional<VideoDetailsDTO> videoDetailsDTOOptional = videoService.getVideoDetailsById(id);
		if(videoDetailsDTOOptional.isPresent()) {
		return ResponseEntity.ok(videoDetailsDTOOptional.get());
		}else {
				return ResponseEntity.notFound().build();
		}
	}
}
