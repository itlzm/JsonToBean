package com.jieshi.bean;


/**
 * 页面配置信息
 * 通过Bean对象getDocInfo方法获取该对象
 * @author Administrator
 *
 */
public class DocInfo {
	
	/*
	 *  "bodyId": "catalog-area",
        "bodyClass": "products-category-page ",
        "lastModified": "2016-11-21@02:17:52 +00:00",
        "title": "男婴外套 | ZARA 中国",
        "description": "男婴新款外套，尽在ZARA官方网站。",
        "pageId": "I2016-NINOS-BEBENINO-ABRIGOS",
        "seoAttributes": "itemscope itemtype=\"http://schema.org/WebPage\"",
        "relData": {
            "canonicalUrl": "",
            "alternateMobile": {
                "href": ""
            }
        }
	 */
	
	private String bodyId;
	private String bodyClass;
	private String lastModified;
	private String title;
	private String description;
	private String pageId;
	private String seoAttributes;
	private RelData relData;
	
	public class RelData {
		
		private String canonicalUrl;
		private AlternateMobile alternateMobile;
		public String getCanonicalUrl() {
			return canonicalUrl;
		}
		public void setCanonicalUrl(String canonicalUrl) {
			this.canonicalUrl = canonicalUrl;
		}
		public AlternateMobile getAlternateMobile() {
			return alternateMobile;
		}
		public void setAlternateMobile(AlternateMobile alternateMobile) {
			this.alternateMobile = alternateMobile;
		}
		@Override
		public String toString() {
			return "RelData [canonicalUrl=" + canonicalUrl + ", alternateMobile=" + alternateMobile + "]";
		}
		
	}
	
	public class AlternateMobile {
		private String href;

		public String getHref() {
			return href;
		}

		public void setHref(String href) {
			this.href = href;
		}

		@Override
		public String toString() {
			return "AlternateMobile [href=" + href + "]";
		}
		
	}

	public String getBodyId() {
		return bodyId;
	}

	public void setBodyId(String bodyId) {
		this.bodyId = bodyId;
	}

	public String getBodyClass() {
		return bodyClass;
	}

	public void setBodyClass(String bodyClass) {
		this.bodyClass = bodyClass;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getSeoAttributes() {
		return seoAttributes;
	}

	public void setSeoAttributes(String seoAttributes) {
		this.seoAttributes = seoAttributes;
	}

	public RelData getRelData() {
		return relData;
	}

	public void setRelData(RelData relData) {
		this.relData = relData;
	}

	@Override
	public String toString() {
		return "DocInfo [bodyId=" + bodyId + ", bodyClass=" + bodyClass + ", lastModified=" + lastModified + ", title="
				+ title + ", description=" + description + ", pageId=" + pageId + ", seoAttributes=" + seoAttributes
				+ ", relData=" + relData + "]";
	}

	

}
