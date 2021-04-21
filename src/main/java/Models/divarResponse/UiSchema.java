package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class UiSchema implements Serializable {

	@SerializedName("status")
	private Status status;

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"UiSchema{" + 
			"status = '" + status + '\'' + 
			"}";
		}
}