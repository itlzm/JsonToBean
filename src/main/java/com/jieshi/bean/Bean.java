package com.jieshi.bean;

import java.util.List;

/**
 * 将json字符串转换为Bean对象,该对象中包含json字符串中所有的属性
 * @author Administrator
 *
 */
public class Bean {

	//类型
	private Category category;
	//产品组集合，保存所有产品信息(***************重要属性********************)
	private List<ProductGroup> productGroups;
	//产品总个数(***************重要属性********************)
	private String productsCount;
	//在新的页面打开产品
	private boolean openProductInNewTab;
	private boolean isShowColorCutsOnCategory;
	//页面信息
	private DocInfo docInfo;
	private List<BreadCrumb> breadCrumbs;
	//解析数据
	private AnalyticsData analyticsData;
	//视图名
	private String viewName;
	private String renderingContext;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<ProductGroup> getProductGroups() {
		return productGroups;
	}
	public void setProductGroups(List<ProductGroup> productGroups) {
		this.productGroups = productGroups;
	}
	public String getProductsCount() {
		return productsCount;
	}
	public void setProductsCount(String productsCount) {
		this.productsCount = productsCount;
	}
	public boolean isOpenProductInNewTab() {
		return openProductInNewTab;
	}
	public void setOpenProductInNewTab(boolean openProductInNewTab) {
		this.openProductInNewTab = openProductInNewTab;
	}
	public boolean isShowColorCutsOnCategory() {
		return isShowColorCutsOnCategory;
	}
	public void setShowColorCutsOnCategory(boolean isShowColorCutsOnCategory) {
		this.isShowColorCutsOnCategory = isShowColorCutsOnCategory;
	}
	public DocInfo getDocInfo() {
		return docInfo;
	}
	public void setDocInfo(DocInfo docInfo) {
		this.docInfo = docInfo;
	}
	public List<BreadCrumb> getBreadCrumbs() {
		return breadCrumbs;
	}
	public void setBreadCrumbs(List<BreadCrumb> breadCrumbs) {
		this.breadCrumbs = breadCrumbs;
	}
	public AnalyticsData getAnalyticsData() {
		return analyticsData;
	}
	public void setAnalyticsData(AnalyticsData analyticsData) {
		this.analyticsData = analyticsData;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public String getRenderingContext() {
		return renderingContext;
	}
	public void setRenderingContext(String renderingContext) {
		this.renderingContext = renderingContext;
	}
	@Override
	public String toString() {
		return "Bean [category=" + category + ", productGroups=" + productGroups + ", productsCount=" + productsCount
				+ ", openProductInNewTab=" + openProductInNewTab + ", isShowColorCutsOnCategory="
				+ isShowColorCutsOnCategory + ", docInfo=" + docInfo + ", breadCrumbs=" + breadCrumbs
				+ ", analyticsData=" + analyticsData + ", viewName=" + viewName + ", renderingContext="
				+ renderingContext + "]";
	}
	
	
	
}
