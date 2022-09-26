package com.swathi.general;

public class Poly1Child extends Poly1 {
	public static void main (String[] args) {
		System.out.println("Hello");
		Poly1 p=new Poly1();
		p.printName("Swathi");
		p.printName("Seshu", 1013);
		Poly1Child pc=new Poly1Child();
		pc.printName("Swathi");
		pc.printName("Seshu", 1013);
	
	}
	public void printName(String name) {
		System.out.println("Child : " + name);
	}
	public void printName(String name, int id) {
		System.out.println("Child : "+ name +"  " + id);
	}

}




