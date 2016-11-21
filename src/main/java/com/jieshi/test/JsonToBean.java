package com.jieshi.test;

import java.io.IOException;
import java.util.List;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import com.google.gson.Gson;
import com.jieshi.bean.AnalyticsData;
import com.jieshi.bean.Bean;
import com.jieshi.bean.BreadCrumb;
import com.jieshi.bean.Category;
import com.jieshi.bean.Detail;
import com.jieshi.bean.Detail.Color;
import com.jieshi.bean.DocInfo;
import com.jieshi.bean.ProductGroup;
import com.jieshi.bean.ProductGroup.Product;
import com.jieshi.bean.Xmedia;


public class JsonToBean {

	/**
	 * 获取json字符串
	 * 
	 * @param url
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 */
	public static String getJsonStr(String url) throws HttpException, IOException {
		// 返回值
		String json = null;

		/* 网络通信开始 */
		HttpClient httpClient = new HttpClient();
		httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(10000);
		httpClient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "GB2312");
		GetMethod getMethod = new GetMethod(url);
		getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 10000);
		getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
		int statusCode = httpClient.executeMethod(getMethod);
		if (statusCode != HttpStatus.SC_OK) {
			System.err.println("请求失败.Method failed:" + getMethod.getStatusLine());
			return null;
		}
		byte[] responseBody = getMethod.getResponseBody();

		json = new String(responseBody);
		/* 网络通信结束 */

		//;window.zara.dataLayer
		//;window.zara.viewPayload 
		int start = json.indexOf(";window.zara.dataLayer");
		int end = json.indexOf(";window.zara.viewPayload");
		json = json.substring(start, end);
		json = json.replace(";window.zara.dataLayer = ", "");
		
		System.out.println(json.substring(0, 100));
		System.out.println(json.substring(json.length()-100, json.length()));
		

		return json;
	}

	/**
	 * 将json字符串转换为对象，从对象中获取需要用到的值
	 * @param jsonStr
	 */
	public static void gsonToBean(String jsonStr) {
		
		Gson gson = new Gson();
		Bean bean= gson.fromJson(jsonStr, Bean.class);

		AnalyticsData analyticsData = bean.getAnalyticsData();
		Category category = bean.getCategory();
		DocInfo docInfo = bean.getDocInfo();
		String productsCount = bean.getProductsCount();
		String renderingContext = bean.getRenderingContext();
		List<BreadCrumb> readCrumbs = bean.getBreadCrumbs();
		System.out.println(readCrumbs);
		
		List<ProductGroup> productGroups = bean.getProductGroups();
		
		System.out.println(analyticsData.getPage().getLanguage());
		System.out.println(category);
		System.out.println(docInfo);
		System.out.println(productsCount);
		System.out.println(renderingContext);
		
		ProductGroup productGroup = productGroups.get(0);
		List<Product> products = productGroup.getProducts();
		Product product = products.get(0);
		
		System.out.println(product.getId());
		System.out.println(product.getKind());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getExtraInfo());
		
		Detail detail = product.getDetail();
		
		List<Color> colors = detail.getColors();
		
		Color color = colors.get(0);
		
		List<Xmedia> xmedias = color.getXmedia();
		
		Xmedia xmedia = xmedias.get(0);
		
		String name = xmedia.getName();
		String path = xmedia.getPath();
		System.out.println(name);
		System.out.println(path);
		
	}

	public static void main(String[] args) throws HttpException, IOException {
		String url = "http://www.zara.cn/cn/zh/%E7%94%B7%E5%A3%AB/%E5%8C%85/%E6%9F%A5%E7%9C%8B%E5%85%A8%E9%83%A8-c734090.html";
		String jsonStr = getJsonStr(url);
		gsonToBean(jsonStr);
	}
	
	

}
