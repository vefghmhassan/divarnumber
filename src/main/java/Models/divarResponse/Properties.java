package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Properties implements Serializable {

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
			"Properties{" + 
			"status = '" + status + '\'' + 
			"}";
		}
}