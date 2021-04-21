package Models.divarResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class SeoDetails implements Serializable {

	@SerializedName("title")
	private String title;

	@SerializedName("description")
	private String description;

	@SerializedName("headline")
	private String headline;

	@SerializedName("meta_robots")
	private MetaRobots metaRobots;

	@SerializedName("bread_crumbs")
	private List<BreadCrumbsItem> breadCrumbs;

	@SerializedName("next")
	private String next;

	@SerializedName("prev")
	private String prev;

	@SerializedName("web_url")
	private String webUrl;

	@SerializedName("android_url")
	private String androidUrl;

	@SerializedName("canonical")
	private String canonical;

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setHeadline(String headline){
		this.headline = headline;
	}

	public String getHeadline(){
		return headline;
	}

	public void setMetaRobots(MetaRobots metaRobots){
		this.metaRobots = metaRobots;
	}

	public MetaRobots getMetaRobots(){
		return metaRobots;
	}

	public void setBreadCrumbs(List<BreadCrumbsItem> breadCrumbs){
		this.breadCrumbs = breadCrumbs;
	}

	public List<BreadCrumbsItem> getBreadCrumbs(){
		return breadCrumbs;
	}

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

	public void setPrev(String prev){
		this.prev = prev;
	}

	public String getPrev(){
		return prev;
	}

	public void setWebUrl(String webUrl){
		this.webUrl = webUrl;
	}

	public String getWebUrl(){
		return webUrl;
	}

	public void setAndroidUrl(String androidUrl){
		this.androidUrl = androidUrl;
	}

	public String getAndroidUrl(){
		return androidUrl;
	}

	public void setCanonical(String canonical){
		this.canonical = canonical;
	}

	public String getCanonical(){
		return canonical;
	}

	@Override
 	public String toString(){
		return 
			"SeoDetails{" + 
			"title = '" + title + '\'' + 
			",description = '" + description + '\'' + 
			",headline = '" + headline + '\'' + 
			",meta_robots = '" + metaRobots + '\'' + 
			",bread_crumbs = '" + breadCrumbs + '\'' + 
			",next = '" + next + '\'' + 
			",prev = '" + prev + '\'' + 
			",web_url = '" + webUrl + '\'' + 
			",android_url = '" + androidUrl + '\'' + 
			",canonical = '" + canonical + '\'' + 
			"}";
		}
}