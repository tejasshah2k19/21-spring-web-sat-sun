package com.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {
	
	public void uploadImage(MultipartFile file) {
	
		File myFilePath = new File("d:\\tmp\\");
		File copyFile = new File(myFilePath,file.getOriginalFilename());

		
		try {
			copyFile.createNewFile();
			byte allBytes[] = file.getBytes();
			FileUtils.writeByteArrayToFile(copyFile, allBytes);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
 }
