package com.readersblogs;

import java.util.Set;

public class Blogs {
	private Integer blogId;
	private String blogWriter;

	public String getBlogWriter() {
		return blogWriter;
	}

	public void setBlogWriter(String blogWriter) {
		this.blogWriter = blogWriter;
	}

	private String title;
	private Set<Readers> readers;

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Readers> getReaders() {
		return readers;
	}

	public void setReaders(Set<Readers> readers) {
		this.readers = readers;
	}
}
