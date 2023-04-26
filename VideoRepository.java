package com.example.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.VideoDetailsDTO;
import com.example.model.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
 
    Optional<Video> findById(Long id);
 
}
