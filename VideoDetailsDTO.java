package com.example.dto;

public class VideoDetailsDTO {

	private Long id;

	private String url;

	private String title;

	private String shortDescription;

	private guestDTO guestDTO;

	private SubCategoryDTO subCategoryDTO;

	public guestDTO getGuestDTO() {
		return guestDTO;
	}

	public void setGuestDTO(guestDTO guestDTO) {
		this.guestDTO = guestDTO;
	}

	public SubCategoryDTO getSubCategoryDTO() {
		return subCategoryDTO;
	}

	public void setSubCategoryDTO(SubCategoryDTO subCategoryDTO) {
		this.subCategoryDTO = subCategoryDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

}
