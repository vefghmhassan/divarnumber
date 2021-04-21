package Models.divar;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class JsonSchemaDTO implements Serializable {
	public JsonSchemaDTO(CategoryDTO category) {
		this.category = category;
	}

	@SerializedName("category")
	private CategoryDTO category;

	public void setCategory(CategoryDTO category){
		this.category = category;
	}

	public CategoryDTO getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"JsonSchemaDTO{" + 
			"category = '" + category + '\'' + 
			"}";
		}
}