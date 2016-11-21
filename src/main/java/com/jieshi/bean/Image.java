package com.jieshi.bean;

/**
 * 该对象通过遍历products集合，获取到每一个product对象后，
 * 再通过product对象使用getImage方法获取到Image对象
 * @author Administrator
 *
 */
public class Image {
	
	/*
	 * "name": "6224908802_2_10",
       "path": "/2016/I/0/3/p/6224/908/802/2/",
       "timestamp": "1478713250229"
	 */
	
	private String name;
	private String path;
	private String timestamp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Image [name=" + name + ", path=" + path + ", timestamp=" + timestamp + "]";
	}
	
}
