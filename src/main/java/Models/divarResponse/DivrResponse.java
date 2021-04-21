package Models.divarResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DivrResponse implements Serializable {

	@SerializedName("input_suggestion")
	private InputSuggestion inputSuggestion;

	@SerializedName("title")
	private String title;

	@SerializedName("subtitle")
	private String subtitle;

	@SerializedName("seo_details")
	private SeoDetails seoDetails;

	@SerializedName("internal_link_sections")
	private Object internalLinkSections;

	@SerializedName("widget_list")
	private List<WidgetListItem> widgetList;

	@SerializedName("last_post_date")
	private long lastPostDate;

	@SerializedName("first_post_date")
	private long firstPostDate;

	@SerializedName("web_widgets")
	private WebWidgets webWidgets;

	@SerializedName("banners")
	private List<Object> banners;

	@SerializedName("suggestion_list")
	private List<Object> suggestionList;

	public void setInputSuggestion(InputSuggestion inputSuggestion){
		this.inputSuggestion = inputSuggestion;
	}

	public InputSuggestion getInputSuggestion(){
		return inputSuggestion;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setSubtitle(String subtitle){
		this.subtitle = subtitle;
	}

	public String getSubtitle(){
		return subtitle;
	}

	public void setSeoDetails(SeoDetails seoDetails){
		this.seoDetails = seoDetails;
	}

	public SeoDetails getSeoDetails(){
		return seoDetails;
	}

	public void setInternalLinkSections(Object internalLinkSections){
		this.internalLinkSections = internalLinkSections;
	}

	public Object getInternalLinkSections(){
		return internalLinkSections;
	}

	public void setWidgetList(List<WidgetListItem> widgetList){
		this.widgetList = widgetList;
	}

	public List<WidgetListItem> getWidgetList(){
		return widgetList;
	}

	public void setLastPostDate(long lastPostDate){
		this.lastPostDate = lastPostDate;
	}

	public long getLastPostDate(){
		return lastPostDate;
	}

	public void setFirstPostDate(long firstPostDate){
		this.firstPostDate = firstPostDate;
	}

	public long getFirstPostDate(){
		return firstPostDate;
	}

	public void setWebWidgets(WebWidgets webWidgets){
		this.webWidgets = webWidgets;
	}

	public WebWidgets getWebWidgets(){
		return webWidgets;
	}

	public void setBanners(List<Object> banners){
		this.banners = banners;
	}

	public List<Object> getBanners(){
		return banners;
	}

	public void setSuggestionList(List<Object> suggestionList){
		this.suggestionList = suggestionList;
	}

	public List<Object> getSuggestionList(){
		return suggestionList;
	}

	@Override
 	public String toString(){
		return 
			"DivrResponse{" + 
			"input_suggestion = '" + inputSuggestion + '\'' + 
			",title = '" + title + '\'' + 
			",subtitle = '" + subtitle + '\'' + 
			",seo_details = '" + seoDetails + '\'' + 
			",internal_link_sections = '" + internalLinkSections + '\'' + 
			",widget_list = '" + widgetList + '\'' + 
			",last_post_date = '" + lastPostDate + '\'' + 
			",first_post_date = '" + firstPostDate + '\'' + 
			",web_widgets = '" + webWidgets + '\'' + 
			",banners = '" + banners + '\'' + 
			",suggestion_list = '" + suggestionList + '\'' + 
			"}";
		}
}