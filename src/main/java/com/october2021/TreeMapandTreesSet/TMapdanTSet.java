package com.october2021.TreeMapandTreesSet;

import java.util.TreeMap;
import java.util.TreeSet;

public class TMapdanTSet {

	public static void main(String[] args) {
		
		//TreeSet
		TreeSet<String> buah=new TreeSet<String>();
	    buah.add("Mangga");
	    buah.add("Rambutan");
	    buah.add("Durian");
	    buah.add("Durian");
	    
	    for (String item : buah) {
			System.out.println(item);
		}
	    
	    //Treemap
	    TreeMap<String,Integer> hrg = new TreeMap<String,Integer>();
	    hrg.put("Mangga",15000);
	    hrg.put("Rambutan",10000);
	    hrg.put("Durian",50000);
	    hrg.put("Durian",50000);
	    
	    System.out.println(hrg);

	}

}
