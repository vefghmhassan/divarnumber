package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Urischema implements Serializable {

	@SerializedName("display")
	private Display display;

	@SerializedName("order")
	private int order;

	public void setDisplay(Display display){
		this.display = display;
	}

	public Display getDisplay(){
		return display;
	}

	public void setOrder(int order){
		this.order = order;
	}

	public int getOrder(){
		return order;
	}

	@Override
 	public String toString(){
		return 
			"Urischema{" + 
			"display = '" + display + '\'' + 
			",order = '" + order + '\'' + 
			"}";
		}
}