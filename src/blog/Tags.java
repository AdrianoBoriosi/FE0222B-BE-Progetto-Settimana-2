package blog;

import java.util.Arrays;

public class Tags {

	private String[] tags;

	public Tags(String[] tags) {
		super();
		this.tags = tags;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Tags: "+ Arrays.toString(tags);
	}
	
	
	
	
	
	
}
