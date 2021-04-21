package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class InputSuggestion implements Serializable {

	@SerializedName("json_schema")
	private JsonSchema jsonSchema;

	@SerializedName("ui_schema")
	private UiSchema uiSchema;

	public void setJsonSchema(JsonSchema jsonSchema){
		this.jsonSchema = jsonSchema;
	}

	public JsonSchema getJsonSchema(){
		return jsonSchema;
	}

	public void setUiSchema(UiSchema uiSchema){
		this.uiSchema = uiSchema;
	}

	public UiSchema getUiSchema(){
		return uiSchema;
	}

	@Override
 	public String toString(){
		return 
			"InputSuggestion{" + 
			"json_schema = '" + jsonSchema + '\'' + 
			",ui_schema = '" + uiSchema + '\'' + 
			"}";
		}
}