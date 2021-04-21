package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class UiOptions implements Serializable {

	@SerializedName("display-text-format")
	private String displayTextFormat;

	@SerializedName("is-advanced")
	private boolean isAdvanced;

	@SerializedName("label")
	private String label;

	@SerializedName("parent-category-slug")
	private String parentCategorySlug;

	@SerializedName("post-set-label")
	private String postSetLabel;

	public void setDisplayTextFormat(String displayTextFormat){
		this.displayTextFormat = displayTextFormat;
	}

	public String getDisplayTextFormat(){
		return displayTextFormat;
	}

	public void setIsAdvanced(boolean isAdvanced){
		this.isAdvanced = isAdvanced;
	}

	public boolean isIsAdvanced(){
		return isAdvanced;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setParentCategorySlug(String parentCategorySlug){
		this.parentCategorySlug = parentCategorySlug;
	}

	public String getParentCategorySlug(){
		return parentCategorySlug;
	}

	public void setPostSetLabel(String postSetLabel){
		this.postSetLabel = postSetLabel;
	}

	public String getPostSetLabel(){
		return postSetLabel;
	}

	@Override
 	public String toString(){
		return 
			"UiOptions{" + 
			"display-text-format = '" + displayTextFormat + '\'' + 
			",is-advanced = '" + isAdvanced + '\'' + 
			",label = '" + label + '\'' + 
			",parent-category-slug = '" + parentCategorySlug + '\'' + 
			",post-set-label = '" + postSetLabel + '\'' + 
			"}";
		}
}