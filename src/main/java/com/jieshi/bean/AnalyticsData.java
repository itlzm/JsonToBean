package com.jieshi.bean;


/**
 * 通过Bean对象getAnalyticsData方法获取该对象
 * @author Administrator
 *
 */
public class AnalyticsData {
	
	
	/*
	 * "appVersion": "1.24.0-b.18",
        "pageType": "PRODUCT_LIST",
        "page": {
            "language": "zh",
            "shop": "CN"
        },
        "trackerUA": "UA-18083935-1",
        "anonymizeIp": "0",
        "hostname": "web-pc.zara.com",
        "catGroupId": 269286,
        "catIdentifier": "I2016-NINOS-BEBENINO-ABRIGOS"
	 */
	private String appVersion;
	private String pageType;
	private Page page;
	private String trackerUA;
	private String anonymizeIp;
	private String hostname;
	private int catGroupId;
	private String catIdentifier;
	
	public class Page {
		
		private String language;
		private String shop;
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getShop() {
			return shop;
		}
		public void setShop(String shop) {
			this.shop = shop;
		}
		@Override
		public String toString() {
			return "Page [language=" + language + ", shop=" + shop + "]";
		}
		
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getTrackerUA() {
		return trackerUA;
	}

	public void setTrackerUA(String trackerUA) {
		this.trackerUA = trackerUA;
	}

	public String getAnonymizeIp() {
		return anonymizeIp;
	}

	public void setAnonymizeIp(String anonymizeIp) {
		this.anonymizeIp = anonymizeIp;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getCatGroupId() {
		return catGroupId;
	}

	public void setCatGroupId(int catGroupId) {
		this.catGroupId = catGroupId;
	}

	public String getCatIdentifier() {
		return catIdentifier;
	}

	public void setCatIdentifier(String catIdentifier) {
		this.catIdentifier = catIdentifier;
	}

	@Override
	public String toString() {
		return "AnalyticsData [appVersion=" + appVersion + ", pageType=" + pageType + ", page=" + page + ", trackerUA="
				+ trackerUA + ", anonymizeIp=" + anonymizeIp + ", hostname=" + hostname + ", catGroupId=" + catGroupId
				+ ", catIdentifier=" + catIdentifier + "]";
	}

	

}
