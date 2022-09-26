package com.swathi.general;

public class Poly1 {
	public static void main (String[] args) {
		System.out.println("Hello");
		Poly1 p=new Poly1();
		p.printName("Swathi");
		p.printName("Seshu", 1013);
	
	}
	public void printName(String name) {
		System.out.println(name);
	}
	public void printName(String name, int id) {
		System.out.println(name +"  " + id);
	}

}




