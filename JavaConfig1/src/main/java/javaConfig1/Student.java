package javaConfig1;

public class Student {
     private String name;
     private int id;
     private double fees;
     private char catg;
     private float hight;
     private boolean live;
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public char getCatg() {
		return catg;
	}
	public void setCatg(char catg) {
		this.catg = catg;
	}
	public float getHight() {
		return hight;
	}
	public void setHight(float hight) {
		this.hight = hight;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
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
}
