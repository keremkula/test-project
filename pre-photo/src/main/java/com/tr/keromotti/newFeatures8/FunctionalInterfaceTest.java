package com.tr.keromotti.newFeatures8;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {

		Foo foo = (x, y) -> (2 * x + y);
		int sonuc = foo.apply(3, 4);
		System.out.println("Sonuc : -> " + sonuc);

	}

}
