package com.beta.thesidebar;

/**
 * Created by Kevein on 2019/2/8.12:25
 */

public class ContentModel {
	private int    imageView;
	private String text;
	private int    id;

	public ContentModel(int imageView, String text, int id) {
		this.imageView = imageView;
		this.text = text;
		this.id = id;
	}

	public int getImageView() {
		return imageView;
	}

	public void setImageView(int imageView) {
		this.imageView = imageView;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
