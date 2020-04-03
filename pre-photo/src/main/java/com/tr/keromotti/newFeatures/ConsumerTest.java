package com.tr.keromotti.newFeatures;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<String> consumer = (msg) -> {
			System.out.println(msg);
		};
		
		consumer.accept("kerem");

	}

}
