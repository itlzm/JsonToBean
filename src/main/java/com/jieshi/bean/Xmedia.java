package com.jieshi.bean;

/**
 * 该对象通过遍历products集合，获取到每一个product对象后，
 * 再通过product对象使用getXmedia方法获取到其所在的List集合，
 * 遍历该集合得到每一个Xmedia对象
 * @author Administrator
 *
 */
public class Xmedia {
	
	/*以下为json格式
	 * "datatype": "xmedia",
            "set": 2,
            "type": "image",
            "kind": "other",
            "path": "/2016/I/0/3/p/6224/908/802/2",
            "name": "6224908802_2_10_1",
            "width": 2479,
            "height": 2740,
            "timestamp": "1478713250229"
	 */
	private String datatype;
	private String set;
	private String type;
	private String kind;
	private String path;
	private String name;
	private int width;
	private int height;
	private String timestamp;
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public String getSet() {
		return set;
	}
	public void setSet(String set) {
		this.set = set;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Image [datatype=" + datatype + ", set=" + set + ", type=" + type + ", kind=" + kind + ", path=" + path
				+ ", name=" + name + ", width=" + width + ", height=" + height + ", timestamp=" + timestamp + "]";
	}
	
	
}
