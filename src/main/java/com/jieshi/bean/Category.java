package com.jieshi.bean;

import java.util.List;


/**
 * 产品种类信息
 * 该对象通过Bean对象getCategory方法获取
 * @author Administrator
 *
 */
public class Category {

	/*	以下为json数据结构，所有属性按照结构设置，其中seo，Attribute，Attributes为内部类
	 * "id": 269286,
        "key": "I2016-NINOS-BEBENINO-ABRIGOS",
        "name": "外套",
        "layoutWeb": "products-category-view",
        "layoutApp": "list",
        "type": "45",
        "viewCategoryId": 0,
        "subcategories": [],
        "seo": {
            "keyword": "",
            "title": "男婴外套 | ZARA 中国",
            "metaDescription": "",
            "metaKeywords": "男婴外套",
            "mainHeader": "男婴外套",
            "description": "男婴双面布料",
            "bannerPosition": -1,
            "breadCrumb": [
                {
                    "text": "儿童",
                    "keyword": "%E5%84%BF%E7%AB%A5",
                    "id": 277007,
                    "seo": {
                        "keyword": "%E5%84%BF%E7%AB%A5"
                    }
                }
            ]
        },
        "layoutWebMobile": "products-category-view",
        "published": [
            "app",
            "store",
            "web",
            "web-mobile"
        ],
        "attributeList": [
            {
                "key": "REVERSE_IDENTITY",
                "value": "SOGIRBA-ONINEBEB-SONIN-6102I"
            }
        ],
        "isStockClearance": false,
        "isCurrent": true,
        "isSelected": true,
        "hasSubcategories": false,
        "attributes": {
            "isSecure": false,
            "mustDisplayContent": false,
            "displayUnfolded": false,
            "showSubcategories": false,
            "isDivider": false
        }
	 */
	private int id;
	private String key;
	private String name;
	private String layoutWeb;
	private String layoutApp;
	private String type;
	private int viewCategoryId;
	private List<?> subcategories;
	private Seo seo;
	private String layoutWebMobile;
	private List<String> published;
	private List<Attribute> attributeList;
	private boolean isStockClearance;
	private boolean isCurrent;
	private boolean isSelected;
	private boolean hasSubcategories;
	private Attributes attributes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLayoutWeb() {
		return layoutWeb;
	}

	public void setLayoutWeb(String layoutWeb) {
		this.layoutWeb = layoutWeb;
	}

	public String getLayoutApp() {
		return layoutApp;
	}

	public void setLayoutApp(String layoutApp) {
		this.layoutApp = layoutApp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getViewCategoryId() {
		return viewCategoryId;
	}

	public void setViewCategoryId(int viewCategoryId) {
		this.viewCategoryId = viewCategoryId;
	}

	public List<?> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<?> subcategories) {
		this.subcategories = subcategories;
	}

	public Seo getSeo() {
		return seo;
	}

	public void setSeo(Seo seo) {
		this.seo = seo;
	}

	public String getLayoutWebMobile() {
		return layoutWebMobile;
	}

	public void setLayoutWebMobile(String layoutWebMobile) {
		this.layoutWebMobile = layoutWebMobile;
	}

	public List<String> getPublished() {
		return published;
	}

	public void setPublished(List<String> published) {
		this.published = published;
	}

	public List<Attribute> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<Attribute> attributeList) {
		this.attributeList = attributeList;
	}

	public boolean isStockClearance() {
		return isStockClearance;
	}

	public void setStockClearance(boolean isStockClearance) {
		this.isStockClearance = isStockClearance;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public boolean isHasSubcategories() {
		return hasSubcategories;
	}

	public void setHasSubcategories(boolean hasSubcategories) {
		this.hasSubcategories = hasSubcategories;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}
	
	
	public class Attribute {
		
		
		private String key;
		private String value;
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "Attribute [key=" + key + ", value=" + value + "]";
		}
		
	}
	
	public class Attributes {

		
		
		private boolean isSecure;
		private boolean mustDisplayContent;
		private boolean displayUnfolded;
		private boolean showSubcategories;
		private boolean isDivider;
		public boolean isSecure() {
			return isSecure;
		}
		public void setSecure(boolean isSecure) {
			this.isSecure = isSecure;
		}
		public boolean isMustDisplayContent() {
			return mustDisplayContent;
		}
		public void setMustDisplayContent(boolean mustDisplayContent) {
			this.mustDisplayContent = mustDisplayContent;
		}
		public boolean isDisplayUnfolded() {
			return displayUnfolded;
		}
		public void setDisplayUnfolded(boolean displayUnfolded) {
			this.displayUnfolded = displayUnfolded;
		}
		public boolean isShowSubcategories() {
			return showSubcategories;
		}
		public void setShowSubcategories(boolean showSubcategories) {
			this.showSubcategories = showSubcategories;
		}
		public boolean isDivider() {
			return isDivider;
		}
		public void setDivider(boolean isDivider) {
			this.isDivider = isDivider;
		}
		@Override
		public String toString() {
			return "Attributes [isSecure=" + isSecure + ", mustDisplayContent=" + mustDisplayContent
					+ ", displayUnfolded=" + displayUnfolded + ", showSubcategories=" + showSubcategories
					+ ", isDivider=" + isDivider + "]";
		}
		
		
	}
	
	public class Seo {

		private String keyword;
		private String title;
		private String metaDescription;
		private String metaKeywords;
		private String mainHeader;
		private String description;
		private int bannerPosition;
		private List<BreadCrumb> breadCrumb;
		public String getKeyword() {
			return keyword;
		}
		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getMetaDescription() {
			return metaDescription;
		}
		public void setMetaDescription(String metaDescription) {
			this.metaDescription = metaDescription;
		}
		public String getMetaKeywords() {
			return metaKeywords;
		}
		public void setMetaKeywords(String metaKeywords) {
			this.metaKeywords = metaKeywords;
		}
		public String getMainHeader() {
			return mainHeader;
		}
		public void setMainHeader(String mainHeader) {
			this.mainHeader = mainHeader;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getBannerPosition() {
			return bannerPosition;
		}
		public void setBannerPosition(int bannerPosition) {
			this.bannerPosition = bannerPosition;
		}
		public List<BreadCrumb> getBreadCrumb() {
			return breadCrumb;
		}
		public void setBreadCrumb(List<BreadCrumb> breadCrumb) {
			this.breadCrumb = breadCrumb;
		}
		@Override
		public String toString() {
			return "Seo [keyword=" + keyword + ", title=" + title + ", metaDescription=" + metaDescription
					+ ", metaKeywords=" + metaKeywords + ", mainHeader=" + mainHeader + ", description=" + description
					+ ", bannerPosition=" + bannerPosition + ", breadCrumb=" + breadCrumb + "]";
		}
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", key=" + key + ", name=" + name + ", layoutWeb=" + layoutWeb + ", layoutApp="
				+ layoutApp + ", type=" + type + ", viewCategoryId=" + viewCategoryId + ", subcategories="
				+ subcategories + ", seo=" + seo + ", layoutWebMobile=" + layoutWebMobile + ", published=" + published
				+ ", attributeList=" + attributeList + ", isStockClearance=" + isStockClearance + ", isCurrent="
				+ isCurrent + ", isSelected=" + isSelected + ", hasSubcategories=" + hasSubcategories + ", attributes="
				+ attributes + "]";
	}
	
	

}
