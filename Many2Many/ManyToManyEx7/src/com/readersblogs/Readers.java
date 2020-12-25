package com.readersblogs;

import java.util.Set;

public class Readers {
	private Integer readerId;
	private String readerName;
	private String comments;
	private Set<Blogs> blogs;

	public Integer getReaderId() {
		return readerId;
	}

	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Set<Blogs> getBlogs() {
		return blogs;
	}

	public void setBlogs(Set<Blogs> blogs) {
		this.blogs = blogs;
	}

}
