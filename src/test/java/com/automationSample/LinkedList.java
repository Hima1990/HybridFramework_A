package com.automationSample;

import java.util.Collections;

import org.testng.annotations.Test;

public class LinkedList {

	@Test
	public static void TestLinked() {
		
		java.util.LinkedList<String> LL = new java.util.LinkedList<>();
		
		String[] str3 = {"this", "is", "sample"};
		String[] str4 = {"test", "one", "test"};
		int k;
		String i;
		String j;
		
		for (k=0; k<= str3.length-1;k++) {
			
			LL.add(str3[k]);
			LL.add(str4[k]);
			
		}
		
		System.out.println(LL);
		Collections.sort(LL);
		System.out.println(LL);
		LL.removeLast();
		System.out.println(LL);
	}
}
