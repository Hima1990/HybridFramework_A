package com.automationSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Combining2String {
	
	@Test
	
	public static void  Combine() {
		
	ArrayList<Integer> AL = new ArrayList<>(Arrays.asList(1,2,3) );
	
	ArrayList<Integer> AL1 = new ArrayList<>(Arrays.asList(0) );
	AL.addAll(AL1);
	
	Collections.sort(AL);
	System.out.println(AL);
	
	
	/*
	for(k = 0 ; k<= Str1.length-1; k++) {
		
	
	AL.add(Str1[k]);
	AL.add(Str2[k]);
    
	
	}
		System.out.println(AL);
		Collections.sort(AL);
		System.out.println(AL);
	    
		
	}*/

}
}