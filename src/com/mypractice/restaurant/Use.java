package com.mypractice.restaurant;

public class Use {
public static void obradi(Procesor p,Object o) {
	System.out.println("Started Procesor "+ p.name());
	System.out.println(p.obradi(o));
//System.out.println(p.getClass().getMethods());
}
public static String s="Disagreement with biliefs is by definition incorrect";
public static void main(String[] args) {
	obradi(new UpperCase(),s);
	obradi(new LowerCase(),s);
	obradi(new Devider(),s);
}
}
