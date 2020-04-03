package com.tr.keromotti.newFeatures;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

	public static void main(String[] args) {

		CompletableFuture<Void> futured1 = CompletableFuture.runAsync(() -> {
			fetchFromDatabase();
		});
		CompletableFuture<Void> futured2 = CompletableFuture.runAsync(() -> {
			saveToFile();
		});

		futured1.join();
		futured2.join();

		CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("İlk görev tamamlandı..");
		});
		CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Diğer görev tamamlandı..");
		});
		CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2);

		System.out.println("Bir arada iki derede.");
		allOf.join();
		System.out.println("Bitti.");

	}

	private static void saveToFile() {

		System.out.println("saving to file!...");

	}

	private static void fetchFromDatabase() {
		System.out.println("fetching from database !");

	}

}
