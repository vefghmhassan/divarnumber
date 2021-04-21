package Models.divar;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CategoryDTO implements Serializable {
	public CategoryDTO(String value) {
		this.value = value;
	}

	@SerializedName("value")
	private String value;

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"CategoryDTO{" + 
			"value = '" + value + '\'' + 
			"}";
		}
}