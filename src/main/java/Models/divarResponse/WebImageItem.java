package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WebImageItem implements Serializable {

	@SerializedName("src")
	private String src;

	@SerializedName("type")
	private String type;

	public void setSrc(String src){
		this.src = src;
	}

	public String getSrc(){
		return src;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"WebImageItem{" + 
			"src = '" + src + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}