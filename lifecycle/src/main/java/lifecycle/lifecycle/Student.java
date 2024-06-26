package lifecycle.lifecycle;

public class Student {
	private String name;
    
	Student(){
		System.out.println("default constructor calling");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName is calling");
		this.name = name;
	}
	
	public void init() {
		System.out.println("init method calling");
	}
	public void destroy() {
		System.out.println("destroy method calling");
	}

}
