package com.tr.keromotti;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InstaHashtager {

	public static void main(String[] args) {
		
		String directory = "C:\\Projects\\workspaces\\pre-photo\\src\\main\\resources";
		String hashTagsFileName = "hashtags1.txt";

		Path path = Paths.get(directory, hashTagsFileName);
		
		Set<String> uniqueHashTags = new TreeSet<>();

		try {
		    List<String> lines = Files.readAllLines(path);
		    //list.forEach(line -> System.out.println(line));
		    		    
		    
		    for(String line : lines)
		    {
		    	List<String> hashTagsPerLine = filterLine(line);
		    	uniqueHashTags.addAll(hashTagsPerLine);
		    }
		    
		    System.out.println("uniqueHashTags count -> " + uniqueHashTags.size());
		    uniqueHashTags.forEach(line -> System.out.println(line));		    
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

	private static List<String> filterLine(String line) {
		String[] tags = line.split(" ");
		List<String> filtered = new ArrayList<>();
		for(String tag : tags)
		{
			filtered.add(tag);
		}
		return filtered;
	}

}
