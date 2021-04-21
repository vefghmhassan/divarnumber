package Models.divarResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Items implements Serializable {

	@SerializedName("enum")
	private List<String> jsonMemberEnum;

	@SerializedName("enumNames")
	private List<String> enumNames;

	@SerializedName("type")
	private String type;

	public void setJsonMemberEnum(List<String> jsonMemberEnum){
		this.jsonMemberEnum = jsonMemberEnum;
	}

	public List<String> getJsonMemberEnum(){
		return jsonMemberEnum;
	}

	public void setEnumNames(List<String> enumNames){
		this.enumNames = enumNames;
	}

	public List<String> getEnumNames(){
		return enumNames;
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
			"Items{" + 
			"enum = '" + jsonMemberEnum + '\'' + 
			",enumNames = '" + enumNames + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}