package Models.divarResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Display implements Serializable {

	@SerializedName("like-new")
	private List<String> likeNew;

	@SerializedName("new")
	private List<String> jsonMemberNew;

	@SerializedName("repair-needed")
	private List<String> repairNeeded;

	@SerializedName("used")
	private List<String> used;

	public void setLikeNew(List<String> likeNew){
		this.likeNew = likeNew;
	}

	public List<String> getLikeNew(){
		return likeNew;
	}

	public void setJsonMemberNew(List<String> jsonMemberNew){
		this.jsonMemberNew = jsonMemberNew;
	}

	public List<String> getJsonMemberNew(){
		return jsonMemberNew;
	}

	public void setRepairNeeded(List<String> repairNeeded){
		this.repairNeeded = repairNeeded;
	}

	public List<String> getRepairNeeded(){
		return repairNeeded;
	}

	public void setUsed(List<String> used){
		this.used = used;
	}

	public List<String> getUsed(){
		return used;
	}

	@Override
 	public String toString(){
		return 
			"Display{" + 
			"like-new = '" + likeNew + '\'' + 
			",new = '" + jsonMemberNew + '\'' + 
			",repair-needed = '" + repairNeeded + '\'' + 
			",used = '" + used + '\'' + 
			"}";
		}
}