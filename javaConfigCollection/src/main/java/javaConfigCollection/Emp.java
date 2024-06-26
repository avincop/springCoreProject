package javaConfigCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
      private String name;
      private List<String> mob;
      private Set<String> Dept;
      private Map<Integer, String> map;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMob() {
		return mob;
	}
	public void setMob(List<String> mob) {
		this.mob = mob;
	}
	public Set<String> getDept() {
		return Dept;
	}
	public void setDept(Set<String> dept) {
		Dept = dept;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
      
      
}
