package Models.divarResponse;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class MetaRobots implements Serializable {

	@SerializedName("follow")
	private boolean follow;

	@SerializedName("index")
	private boolean index;

	public void setFollow(boolean follow){
		this.follow = follow;
	}

	public boolean isFollow(){
		return follow;
	}

	public void setIndex(boolean index){
		this.index = index;
	}

	public boolean isIndex(){
		return index;
	}

	@Override
 	public String toString(){
		return 
			"MetaRobots{" + 
			"follow = '" + follow + '\'' + 
			",index = '" + index + '\'' + 
			"}";
		}
}