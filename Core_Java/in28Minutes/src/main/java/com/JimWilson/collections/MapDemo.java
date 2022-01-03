package com.JimWilson.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map= new HashMap<>();	
		
		map.put("2222","ghi");
		map.put("3333","abc");
		map.put("1111","def");
		
		String string = map.get("2222");  //ghi
		String orDefault = map.getOrDefault("9999", "xyz"); 
		// no 9999 key so it will return default xyz
		
		
//		using lambda on map
//		here lambda express use By consumer, accepts 2 parameters
		map.forEach( (k,v) -> System.out.println(k +" | "+v));
		
		
//		uses ByFunction 
		map.replaceAll((k,v) -> v.toUpperCase());
		System.out.println("==========after map replace all  =============");
		map.forEach( (k,v) -> System.out.println(k +" | "+v));
		
	}

}
