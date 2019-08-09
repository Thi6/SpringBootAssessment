package com.user.entity;

import java.time.LocalDateTime;

import javax.persistence.Id;

public class SentSearch {

		
		
		@Id
		private Long UserId;
		private String memberNumber;
		private String name;
		private String searchTerm;
		private LocalDateTime time;
			
		public SentSearch() {}
		
		public SentSearch(Search search) {
			this.UserId = search.getUserId();
			this.memberNumber = search.getMemberNumber();
			this.name = search.getName();
			this.searchTerm = search.getSearchTerm();
			this.time = search.getLocalDateTime();
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

		public LocalDateTime getTime() {
			return time;
		}

		public void setTime(LocalDateTime time) {
			this.time = time;
		}
	
		
		
	
}
