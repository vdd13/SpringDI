package pl.dom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("Successed !!!!!!");
		tech.techName();
	}
	
	private String name = "Jan kowa";

	private int id;
	@Autowired
	private Tech tech;
	
}
