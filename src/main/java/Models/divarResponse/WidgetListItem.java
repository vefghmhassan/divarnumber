package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WidgetListItem implements Serializable {

	@SerializedName("widget_type")
	private String widgetType;

	@SerializedName("data")
	private Data data;

	public void setWidgetType(String widgetType){
		this.widgetType = widgetType;
	}

	public String getWidgetType(){
		return widgetType;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"WidgetListItem{" + 
			"widget_type = '" + widgetType + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}