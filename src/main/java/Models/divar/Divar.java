package Models.divar;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Divar implements Serializable {

	@SerializedName("json_schema")
	private JsonSchemaDTO jsonSchema;

	@SerializedName("page")
	private int page;

	public void setJsonSchema(JsonSchemaDTO jsonSchema){
		this.jsonSchema = jsonSchema;
	}

	public JsonSchemaDTO getJsonSchema(){
		return jsonSchema;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	@Override
 	public String toString(){
		return 
			"{" +
			"json_schema = '" + jsonSchema + '\'' + 
			",page = '" + page + '\'' + 
			"}";
		}
}