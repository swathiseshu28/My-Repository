package com.swathi.general;

public class Tables {
	public static void main (String args[]) {
		for(int x=1; x<=20; x=x+1) {
			for(int y=1; y<=10; y=y+1) {
				int z;
				z=x*y;
				System.out.println(x + "x" + y + "=" +z);
			}
		}
	}

}
