package com.tr.keromotti;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class InstaHashtager {

	private static final int INSTAGRAM_MAX_HASHTAG = 30;

	public static void main(String[] args) {

		String directory = "C:\\temp\\gitTest\\test-project\\pre-photo\\src\\main\\resources";
		String hashTagsFileName = "LongExposureHashTags.txt";

		Path path = Paths.get(directory, hashTagsFileName);

		Set<String> uniqueHashTags = new TreeSet<>();

		try {
			List<String> lines = Files.readAllLines(path);
			// list.forEach(line -> System.out.println(line));

			for (String line : lines) {
				List<String> hashTagsPerLine = filterLine(line);
				uniqueHashTags.addAll(hashTagsPerLine);
			}

			System.out.println("uniqueHashTags count -> " + uniqueHashTags.size());
			uniqueHashTags.forEach(line -> System.out.println(line));

			boolean selectRandomHashTags = true;
			if (selectRandomHashTags) {
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
				
				System.out.println("Random selected Hashtag List-> ");

				List<String> randomHashTagList = new ArrayList<>(uniqueHashTags);
				Collections.shuffle(randomHashTagList);
				Collections.shuffle(randomHashTagList);
				Collections.shuffle(randomHashTagList);
				Collections.shuffle(randomHashTagList);

				for (int index = 0; index < INSTAGRAM_MAX_HASHTAG; index++) {
					System.out.println(randomHashTagList.get(index));
				}
				System.out.println("******");
				System.out.println("******");
				System.out.println("******");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static List<String> filterLine(String line) {
		String[] tags = line.split(" ");
		List<String> filtered = new ArrayList<>();
		for (String tag : tags) {
			filtered.add(tag);
		}
		return filtered;
	}

}
