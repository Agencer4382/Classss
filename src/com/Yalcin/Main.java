package com.Yalcin;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Map <String, String>map=new HashMap<>();
    map.put("ONE","AAA");
    map.put("TWO","BBB");
    map.put("THREE","CCC");
    map.put("FOUR","DDD");
    map.put("FIVE","EEE");
    
    System.out.println("HashMap Before Remove : ");
   
   for (Map.Entry<String, String>entry:map.entrySet()){
     System.out.println(entry.getKey()+" : "+entry.getValue());
   
    
   }
   System.out.println("HashMap After Remove : ");
  Iterator<Map.Entry<String, String>>it=map.entrySet().iterator();
  while(it.hasNext()) {
	 Map.Entry<String, String>entry=it.next();
     if(entry.getKey()!="ONE"&&entry.getKey()!="FOUR") {
    	 it.remove();
    	 System.out.println(entry.getKey()+" : "+entry.getValue());
     }
	 
	  
  }
  
  
	  
   
  }
}