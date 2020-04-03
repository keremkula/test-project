package com.tr.keromotti.newFeatures;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		Optional<Integer> ofNullable = Optional.ofNullable(null);
		int value = ofNullable.orElse(10);
		System.out.println("Value -> " + value);

	}

}
