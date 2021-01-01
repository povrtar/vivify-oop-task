package com.mypractice.restaurant;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		SortedSet<String > sortedSet=new TreeSet<>();
		Collections.addAll(sortedSet, "one two three four five sex seven eight nine".split(" "));
		System.out.println(sortedSet);

	}

}
