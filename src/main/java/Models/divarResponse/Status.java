package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Status implements Serializable {

	@SerializedName("ui:field")
	private String uiField;

	@SerializedName("ui:options")
	private UiOptions uiOptions;

	@SerializedName("urischema")
	private Urischema urischema;

	@SerializedName("value")
	private Value value;

	public void setUiField(String uiField){
		this.uiField = uiField;
	}

	public String getUiField(){
		return uiField;
	}

	public void setUiOptions(UiOptions uiOptions){
		this.uiOptions = uiOptions;
	}

	public UiOptions getUiOptions(){
		return uiOptions;
	}

	public void setUrischema(Urischema urischema){
		this.urischema = urischema;
	}

	public Urischema getUrischema(){
		return urischema;
	}

	public void setValue(Value value){
		this.value = value;
	}

	public Value getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"Status{" + 
			"ui:field = '" + uiField + '\'' + 
			",ui:options = '" + uiOptions + '\'' + 
			",urischema = '" + urischema + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}