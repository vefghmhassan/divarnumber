package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class JsonSchema implements Serializable {

	@SerializedName("properties")
	private Properties properties;

	@SerializedName("type")
	private String type;

	public void setProperties(Properties properties){
		this.properties = properties;
	}

	public Properties getProperties(){
		return properties;
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
			"JsonSchema{" + 
			"properties = '" + properties + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}