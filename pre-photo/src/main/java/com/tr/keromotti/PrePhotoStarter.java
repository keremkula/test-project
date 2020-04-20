package com.tr.keromotti;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.tr.keromotti.util.Utils;

public class PrePhotoStarter {

	public static void main(String[] args) throws Exception {

		String folderPath = "C:\\Users\\Kerem\\Desktop\\2019_02_23 Usak";
		String nefFolderPath = "C:\\Users\\Kerem\\Desktop\\2019_02_23 Usak\\NEF";
		List<File> jpgFilesOnFolder = listJpgFilesOnFolder(folderPath);

		for (File jpgFile : jpgFilesOnFolder) {
			moveNefFileToJpgFolder(nefFolderPath, jpgFile);
		}
		
		System.out.println("PrePhotoStarter finished!...");
	}

	private static void moveNefFileToJpgFolder(String nefFolderPath, File jpgFile) throws Exception {
		String fileName = jpgFile.getName();
		String fileNameWithoutExtension = removeExtensionFromFileName(fileName);
		String nefSourceFilePath = nefFolderPath + "\\" + fileNameWithoutExtension + "." + Utils.NEF_EXTENSION;
		String nefTargetFilePath = jpgFile.getParent() + "\\" + fileNameWithoutExtension + "." + Utils.NEF_EXTENSION;

//		System.out.println("nefSourceFilePath -> " + nefSourceFilePath);
//		System.out.println("nefTargetFilePath -> " + nefTargetFilePath);

		Path temp =  Files.move(Paths.get(nefSourceFilePath), Paths.get(nefTargetFilePath));
		if (temp != null) {
			System.out.println("Moving file -> " + nefSourceFilePath + " TO " + nefTargetFilePath);
		} else {
			System.out.println("Failed to move the file");
		}

	}

	private static List<File> listJpgFilesOnFolder(String folderPath) throws Exception {
		List<File> jpegFiles = new ArrayList<File>();

		File folder = new File(folderPath);
		File[] filesInFolder = folder.listFiles();

		for (File file : filesInFolder) {
			if (file.isFile() && isJpgFile(file)) {
				jpegFiles.add(file);
			}
		}
		return jpegFiles;
	}

	private static boolean isJpgFile(File file) {
		String fileName = file.getName();
		String extension = prepareExtensionFromFileName(fileName);
		return Utils.JPG_EXTENSION.equalsIgnoreCase(extension);
	}

	private static String removeExtensionFromFileName(String fileNameWithExtension) {

		int extensionStartPoint = fileNameWithExtension.indexOf(".");
		String fileNameWithoutExtension = fileNameWithExtension.substring(0, extensionStartPoint);
		return fileNameWithoutExtension;
	}
	
	private static String prepareExtensionFromFileName(String fileNameWithExtension) {

		int extensionStartPoint = fileNameWithExtension.indexOf(".");
		String extension = fileNameWithExtension.substring(extensionStartPoint + 1, fileNameWithExtension.length());
		return extension;
	}

//	private static void moveFileToUpFolder(String evrakFullPath, String evrakDirectoryString) throws Exception {
//		System.out.println("Moving file -> " + evrakFullPath + " TO " + evrakDirectoryString);
//
//		int lastIndexOf = evrakFullPath.lastIndexOf("\\");
//		String evrakFileName = evrakFullPath.substring(lastIndexOf + 1);
////System.out.println(" ------ > " + evrakFileName);
//
//		Path temp = Files.move(Paths.get(evrakFullPath), Paths.get(evrakDirectoryString + "\\" + evrakFileName));
//
//		if (temp != null) {
//			System.out.println("Moving file -> " + evrakFullPath + " TO " + evrakDirectoryString);
//		} else {
//			System.out.println("Failed to move the file");
//		}
//	}
//

}
