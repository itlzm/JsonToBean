package com.jieshi.bean;

import java.util.List;

import com.jieshi.bean.Category.Seo;




/**
 * 产品组信息
 * 通过Bean对象getBean方法获取该对象
 * @author Administrator
 *
 */
public class ProductGroup {

	/*
	 * {
            "type": "main",
            "products": [
                {
                    "id": 3957522,
                    "type": "Product",
                    "kind": "Wear",
                    "sequence": 1,
                    "image": {
                        "name": "6224908802_2_10",
                        "path": "/2016/I/0/3/p/6224/908/802/2/",
                        "timestamp": "1478713250229"
                    },
                    "xmedia": [
                        {
                            "datatype": "xmedia",
                            "set": 2,
                            "type": "image",
                            "kind": "other",
                            "path": "/2016/I/0/3/p/6224/908/802/2",
                            "name": "6224908802_2_10_1",
                            "width": 2479,
                            "height": 2740,
                            "timestamp": "1478713250229"
                        }
                    ],
                    "name": "纹理针织毛圈布西装外套",
                    "isBuyable": true,
                    "price": 17900,
                    "bundleProductSummaries": [],
                    "tags": [],
                    "detail": {
                        "reference": "06224908-I2016",
                        "displayReference": "6224/908",
                        "composition": [],
                        "care": [],
                        "colors": [
                            {
                                "id": "802",
                                "name": "灰色",
                                "image": {
                                    "name": "6224908802_2_10",
                                    "path": "/2016/I/0/3/p/6224/908/802/2/",
                                    "timestamp": "1478713250229"
                                },
                                "colorImageUrl": "",
                                "colorImage": {
                                    "name": "6224908802_3_1",
                                    "path": "/2016/I/0/3/p/6224/908/802/2/",
                                    "timestamp": "1477472646243"
                                },
                                "detailImages": [
                                    {
                                        "name": "6224908802_1_1",
                                        "path": "/2016/I/0/3/p/6224/908/802/2/",
                                        "timestamp": "1477571428300"
                                    }
                                ],
                                "detailFlatImages": [],
                                "sizeGuideImages": [],
                                "videos": [],
                                "xmedia": [
                                    {
                                        "datatype": "xmedia",
                                        "set": 2,
                                        "type": "image",
                                        "kind": "other",
                                        "path": "/2016/I/0/3/p/6224/908/802/2",
                                        "name": "6224908802_2_10_1",
                                        "width": 2479,
                                        "height": 2740,
                                        "timestamp": "1478713250229"
                                    }
                                ],
                                "sizes": [],
                                "isStockClearance": false
                            }
                        ],
                        "relatedProducts": [],
                        "bundleProducts": [],
                        "categories": [],
                        "isBuyable": true
                    },
                    "section": 3,
                    "sectionName": "KID",
                    "extraInfo": {},
                    "seo": {
                        "keyword": "",
                        "bannerPosition": 0,
                        "breadCrumb": []
                    },
                    "tagTypes": []
                }
            ]
        }
	 */
	
	private String type;
	private List<Product> products;
	
	public class Product {
		
		private String id;
		private String type;
		private String kind;
		private String sequence;
		private Image image;
		private List<Xmedia> xmedia;
		private String name;
		private boolean isBuyable;
		private int price;
		private List<?> bundleProductSummaries;
		private List<?> tags;
		private Detail detail;
		private String section;
		private String sectionName;
		private ExtraInfo extraInfo;
		private Seo seo;
		private List<?> tagTypes;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
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
		public String getSequence() {
			return sequence;
		}
		public void setSequence(String sequence) {
			this.sequence = sequence;
		}
		public Image getImage() {
			return image;
		}
		public void setImage(Image image) {
			this.image = image;
		}
		public List<Xmedia> getXmedia() {
			return xmedia;
		}
		public void setXmedia(List<Xmedia> xmedia) {
			this.xmedia = xmedia;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isBuyable() {
			return isBuyable;
		}
		public void setBuyable(boolean isBuyable) {
			this.isBuyable = isBuyable;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public List<?> getBundleProductSummaries() {
			return bundleProductSummaries;
		}
		public void setBundleProductSummaries(List<?> bundleProductSummaries) {
			this.bundleProductSummaries = bundleProductSummaries;
		}
		public List<?> getTags() {
			return tags;
		}
		public void setTags(List<?> tags) {
			this.tags = tags;
		}
		public Detail getDetail() {
			return detail;
		}
		public void setDetail(Detail detail) {
			this.detail = detail;
		}
		public String getSection() {
			return section;
		}
		public void setSection(String section) {
			this.section = section;
		}
		public String getSectionName() {
			return sectionName;
		}
		public void setSectionName(String sectionName) {
			this.sectionName = sectionName;
		}
		public ExtraInfo getExtraInfo() {
			return extraInfo;
		}
		public void setExtraInfo(ExtraInfo extraInfo) {
			this.extraInfo = extraInfo;
		}
		public Seo getSeo() {
			return seo;
		}
		public void setSeo(Seo seo) {
			this.seo = seo;
		}
		public List<?> getTagTypes() {
			return tagTypes;
		}
		public void setTagTypes(List<?> tagTypes) {
			this.tagTypes = tagTypes;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", type=" + type + ", kind=" + kind + ", sequence=" + sequence + ", image="
					+ image + ", xmedia=" + xmedia + ", name=" + name + ", isBuyable=" + isBuyable + ", price=" + price
					+ ", bundleProductSummaries=" + bundleProductSummaries + ", tags=" + tags + ", detail=" + detail
					+ ", section=" + section + ", sectionName=" + sectionName + ", extraInfo=" + extraInfo + ", seo="
					+ seo + ", tagTypes=" + tagTypes + "]";
		}
		
		
		
	}
	
	class ExtraInfo { }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductGroup [type=" + type + ", products=" + products + "]";
	}
	
	
}
