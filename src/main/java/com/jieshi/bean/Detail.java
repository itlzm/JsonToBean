package com.jieshi.bean;

import java.util.List;


/**
 * 该对象通过遍历products集合，获取到每一个product对象后，
 * 再通过product对象使用getDetail方法获取到Detail对象，
 * @author Administrator
 *
 */
public class Detail {
	
	/*
	 * "reference": "06224908-I2016",
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
	 */
	
	
	private String reference;
	private String displayReference;
	private List<?> composition;
	private List<?> care;
	private List<Color> colors;
	private List<?> relatedProducts;
	private List<?> bundleProducts;
	private List<?> categories;
	private boolean isBuyable;
	
	public class Color {
		
		private String id;
		private String name;
		private Image image;
		private String colorImageUrl;
		private ColorImage colorImage;
		private List<DetailImage> detailImages;
		private List<?> detailFlatImages;
		private List<?> sizeGuideImages;
		private List<?> videos;
		private List<Xmedia> xmedia;
		private List<?> sizes;
		private boolean isStockClearance;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Image getImage() {
			return image;
		}
		public void setImage(Image image) {
			this.image = image;
		}
		public String getColorImageUrl() {
			return colorImageUrl;
		}
		public void setColorImageUrl(String colorImageUrl) {
			this.colorImageUrl = colorImageUrl;
		}
		public ColorImage getColorImage() {
			return colorImage;
		}
		public void setColorImage(ColorImage colorImage) {
			this.colorImage = colorImage;
		}
		public List<DetailImage> getDetailImages() {
			return detailImages;
		}
		public void setDetailImages(List<DetailImage> detailImages) {
			this.detailImages = detailImages;
		}
		public List<?> getDetailFlatImages() {
			return detailFlatImages;
		}
		public void setDetailFlatImages(List<?> detailFlatImages) {
			this.detailFlatImages = detailFlatImages;
		}
		public List<?> getSizeGuideImages() {
			return sizeGuideImages;
		}
		public void setSizeGuideImages(List<?> sizeGuideImages) {
			this.sizeGuideImages = sizeGuideImages;
		}
		public List<?> getVideos() {
			return videos;
		}
		public void setVideos(List<?> videos) {
			this.videos = videos;
		}
		public List<Xmedia> getXmedia() {
			return xmedia;
		}
		public void setXmedia(List<Xmedia> xmedia) {
			this.xmedia = xmedia;
		}
		public List<?> getSizes() {
			return sizes;
		}
		public void setSizes(List<?> sizes) {
			this.sizes = sizes;
		}
		public boolean isStockClearance() {
			return isStockClearance;
		}
		public void setStockClearance(boolean isStockClearance) {
			this.isStockClearance = isStockClearance;
		}
		@Override
		public String toString() {
			return "Color [id=" + id + ", name=" + name + ", image=" + image + ", colorImageUrl=" + colorImageUrl
					+ ", colorImage=" + colorImage + ", detailImages=" + detailImages + ", detailFlatImages="
					+ detailFlatImages + ", sizeGuideImages=" + sizeGuideImages + ", videos=" + videos + ", xmedia="
					+ xmedia + ", sizes=" + sizes + ", isStockClearance=" + isStockClearance + "]";
		}
		
	}
	
	public class ColorImage {
		
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
			return "ColorImage [name=" + name + ", path=" + path + ", timestamp=" + timestamp + "]";
		}
		
	}
	
	public class DetailImage {
		
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
			return "DetailImage [name=" + name + ", path=" + path + ", timestamp=" + timestamp + "]";
		}
		
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDisplayReference() {
		return displayReference;
	}

	public void setDisplayReference(String displayReference) {
		this.displayReference = displayReference;
	}

	public List<?> getComposition() {
		return composition;
	}

	public void setComposition(List<?> composition) {
		this.composition = composition;
	}

	public List<?> getCare() {
		return care;
	}

	public void setCare(List<?> care) {
		this.care = care;
	}

	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}

	public List<?> getRelatedProducts() {
		return relatedProducts;
	}

	public void setRelatedProducts(List<?> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}

	public List<?> getBundleProducts() {
		return bundleProducts;
	}

	public void setBundleProducts(List<?> bundleProducts) {
		this.bundleProducts = bundleProducts;
	}

	public List<?> getCategories() {
		return categories;
	}

	public void setCategories(List<?> categories) {
		this.categories = categories;
	}

	public boolean isBuyable() {
		return isBuyable;
	}

	public void setBuyable(boolean isBuyable) {
		this.isBuyable = isBuyable;
	}

	@Override
	public String toString() {
		return "Detail [reference=" + reference + ", displayReference=" + displayReference + ", composition="
				+ composition + ", care=" + care + ", colors=" + colors + ", relatedProducts=" + relatedProducts
				+ ", bundleProducts=" + bundleProducts + ", categories=" + categories + ", isBuyable=" + isBuyable
				+ "]";
	}
	
	

}
