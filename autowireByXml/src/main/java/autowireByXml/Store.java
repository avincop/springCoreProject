package autowireByXml;

import org.springframework.beans.factory.annotation.Autowired;

public class Store {
     private String name;
     @Autowired
     private Product product;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProduct() {
		return product;
	}
	
}
