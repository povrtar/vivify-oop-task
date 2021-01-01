package com.mypractice.restaurant;

public class Procesor {
public  String name() {
	//System.out.println(getClass().getMethods().toString());
	ispisi();
	return getClass().getSimpleName();
}
public Object obradi(Object ulaz) {
	return ulaz;
	
}
private  void ispisi() {
	System.out.println(getClass().getMethods());
}
}
