package com.jieshi.bean;

import com.jieshi.bean.Category.Seo;

/**
 * 通过Bean对象getBreadCrumb方法获取该对象
 * @author Administrator
 *
 */
public class BreadCrumb {

	/*
	 * "text": "儿童",
    "keyword": "%E5%84%BF%E7%AB%A5",
    "id": 277007,
    "seo": {
        "keyword": "%E5%84%BF%E7%AB%A5"
    }
	 */
	private String text;
	private String keyword;
	private int id;
	private Seo seo;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Seo getSeo() {
		return seo;
	}
	public void setSeo(Seo seo) {
		this.seo = seo;
	}
	@Override
	public String toString() {
		return "BreadCrumb [text=" + text + ", keyword=" + keyword + ", id=" + id + ", seo=" + seo + "]";
	}
	
	
}
