package pl.dom;

import org.springframework.stereotype.Component;

@Component
public class Tech {

	private String techname;

	public String getTechname() {
		return techname;
	}

	public void setTechname(String techname) {
		this.techname = techname;
	}
	
	
	public void techName() {
		System.out.println("Tech techName");
	}
	
}
