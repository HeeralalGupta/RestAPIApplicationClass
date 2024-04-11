package com.apiclass.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

public class PostRequestData {
	@NotNull(message = "Category field should not be null.")
	private String category;
	@NotNull(message = "Content field should not be null.")
	private String content;
	@NotNull(message = "Category field should not be null.")
	private String postBy;
	@PastOrPresent
	private Date date;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPostBy() {
		return postBy;
	}
	public void setPostBy(String postBy) {
		this.postBy = postBy;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
