package Models.divarResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WebWidgets implements Serializable {

	@SerializedName("toolbox")
	private List<Object> toolbox;

	@SerializedName("post_list")
	private List<PostListItem> postList;

	public void setToolbox(List<Object> toolbox){
		this.toolbox = toolbox;
	}

	public List<Object> getToolbox(){
		return toolbox;
	}

	public void setPostList(List<PostListItem> postList){
		this.postList = postList;
	}

	public List<PostListItem> getPostList(){
		return postList;
	}

	@Override
 	public String toString(){
		return 
			"WebWidgets{" + 
			"toolbox = '" + toolbox + '\'' + 
			",post_list = '" + postList + '\'' + 
			"}";
		}
}