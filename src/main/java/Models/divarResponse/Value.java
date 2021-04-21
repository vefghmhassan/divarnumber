package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Value implements Serializable {

	@SerializedName("items")
	private Items items;

	@SerializedName("ui:options")
	private UiOptions uiOptions;

	@SerializedName("ui:placeholder")
	private String uiPlaceholder;

	@SerializedName("ui:widget")
	private String uiWidget;

	public void setItems(Items items){
		this.items = items;
	}

	public Items getItems(){
		return items;
	}

	public void setUiOptions(UiOptions uiOptions){
		this.uiOptions = uiOptions;
	}

	public UiOptions getUiOptions(){
		return uiOptions;
	}

	public void setUiPlaceholder(String uiPlaceholder){
		this.uiPlaceholder = uiPlaceholder;
	}

	public String getUiPlaceholder(){
		return uiPlaceholder;
	}

	public void setUiWidget(String uiWidget){
		this.uiWidget = uiWidget;
	}

	public String getUiWidget(){
		return uiWidget;
	}

	@Override
 	public String toString(){
		return 
			"Value{" + 
			"items = '" + items + '\'' + 
			",ui:options = '" + uiOptions + '\'' + 
			",ui:placeholder = '" + uiPlaceholder + '\'' + 
			",ui:widget = '" + uiWidget + '\'' + 
			"}";
		}
}