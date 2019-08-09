package com.core.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Search {
	
	
	@Id
	private Long UserId;
	private String memberNumber;
	private String name;
	private String searchTerm;
	private LocalDateTime localDateTime = LocalDateTime.now();
		
	public Search(Long userId, String memberNumber, String name, String searchTerm, LocalDateTime localDateTime) {
		super();
		UserId = userId;
		this.memberNumber = memberNumber;
		this.name = name;
		this.searchTerm = searchTerm;
		this.localDateTime = localDateTime;
	}
	
	public Search() {

	}
	
	//getters and setters
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSearchTerm() {
		return searchTerm;
	}
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	
	
}
