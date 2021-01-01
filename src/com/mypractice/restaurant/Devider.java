package com.mypractice.restaurant;

import java.util.Arrays;

public class Devider extends Procesor {
	public String obradi(Object ulaz) {
		return Arrays.toString(((String)ulaz).split(" "));
	}

}
