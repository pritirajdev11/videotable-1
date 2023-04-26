package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.SubCategoryDTO;
import com.example.dto.VideoDetailsDTO;
import com.example.dto.guestDTO;
import com.example.model.Guest;
import com.example.model.SubCategory;
import com.example.model.Video;
import com.example.repository.VideoRepository;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public Optional<VideoDetailsDTO> getVideoDetailsById(Long id) {
        Optional<Video> videoOptional = videoRepository.findById(id);

        if (videoOptional.isPresent()) {
            Video video = videoOptional.get();
            VideoDetailsDTO videoDetailsDTO = new VideoDetailsDTO();
            videoDetailsDTO.setId(video.getId());
            videoDetailsDTO.setUrl(video.getUrl());
            videoDetailsDTO.setTitle(video.getTitle());
            videoDetailsDTO.setShortDescription(video.getShortDescription());
           
            SubCategory subCategory = video.getSubCategory();
            SubCategoryDTO subCategoryDTO = new SubCategoryDTO();
            subCategory.setId(subCategory.getId());
            subCategory.setName(subCategory.getName());
            
            videoDetailsDTO.setSubCategoryDTO(subCategoryDTO);
            
            Guest guest = video.getGuest();
            guestDTO guestDTO = new guestDTO();
            guest.setId(guestDTO.getId());
            guest.setName(guestDTO.getName());
            
            videoDetailsDTO.setGuestDTO(guestDTO);
            		
          
            return Optional.of(videoDetailsDTO);
        } else {
            return Optional.empty();
        }
    }


	public void addVideo(Video video) {
		videoRepository.save(video);
		
	}
}
