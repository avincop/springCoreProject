package javaConfigCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;

public class SpringConfig {
    public List<String> getList(){
    	List<String> list= new ArrayList<String>();
    	list.add("9929");
    	list.add("9929");
    	list.add("9929");
    	list.add("9929");
    	return list;
    }
    
    public Set<String> getSet(){
    	Set<String> set= new HashSet<String>();
    	set.add("IT");
    	set.add("IT");
    	set.add("Procces");
    	return set;    	
    }
    
    public Map<Integer, String> getMap(){
    	Map<Integer, String> map= new HashMap<Integer, String>();
    	map.put(101, "laptop");
    	map.put(102, "Desktop");
    	map.put(102, "Tab");
    	return map;
    	
    }
    
    @Bean
    public Emp getObj() {
    	Emp emp= new Emp();
    	emp.setName("Avinash");
    	emp.setMob(getList());
    	emp.setDept(getSet());
    	emp.setMap(getMap());
    	return emp;
    }
}
