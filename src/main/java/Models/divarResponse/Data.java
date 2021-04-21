package Models.divarResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Data implements Serializable {

	@SerializedName("title")
	private String title;

	@SerializedName("image")
	private String image;

	@SerializedName("web_image")
	private List<WebImageItem> webImage;

	@SerializedName("description")
	private String description;

	@SerializedName("has_chat")
	private boolean hasChat;

	@SerializedName("red_text")
	private String redText;

	@SerializedName("normal_text")
	private String normalText;

	@SerializedName("token")
	private String token;

	@SerializedName("image_overlay_tag")
	private Object imageOverlayTag;

	@SerializedName("image_top_left_tag")
	private Object imageTopLeftTag;

	@SerializedName("index")
	private int index;

	@SerializedName("city")
	private String city;

	@SerializedName("district")
	private String district;

	@SerializedName("category")
	private String category;

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setWebImage(List<WebImageItem> webImage){
		this.webImage = webImage;
	}

	public List<WebImageItem> getWebImage(){
		return webImage;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setHasChat(boolean hasChat){
		this.hasChat = hasChat;
	}

	public boolean isHasChat(){
		return hasChat;
	}

	public void setRedText(String redText){
		this.redText = redText;
	}

	public String getRedText(){
		return redText;
	}

	public void setNormalText(String normalText){
		this.normalText = normalText;
	}

	public String getNormalText(){
		return normalText;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}

	public void setImageOverlayTag(Object imageOverlayTag){
		this.imageOverlayTag = imageOverlayTag;
	}

	public Object getImageOverlayTag(){
		return imageOverlayTag;
	}

	public void setImageTopLeftTag(Object imageTopLeftTag){
		this.imageTopLeftTag = imageTopLeftTag;
	}

	public Object getImageTopLeftTag(){
		return imageTopLeftTag;
	}

	public void setIndex(int index){
		this.index = index;
	}

	public int getIndex(){
		return index;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setDistrict(String district){
		this.district = district;
	}

	public String getDistrict(){
		return district;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"title = '" + title + '\'' + 
			",image = '" + image + '\'' + 
			",web_image = '" + webImage + '\'' + 
			",description = '" + description + '\'' + 
			",has_chat = '" + hasChat + '\'' + 
			",red_text = '" + redText + '\'' + 
			",normal_text = '" + normalText + '\'' + 
			",token = '" + token + '\'' + 
			",image_overlay_tag = '" + imageOverlayTag + '\'' + 
			",image_top_left_tag = '" + imageTopLeftTag + '\'' + 
			",index = '" + index + '\'' + 
			",city = '" + city + '\'' + 
			",district = '" + district + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}