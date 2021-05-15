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

	public String uploadStudentImage(MultipartFile file,String path) {
		
		File myFilePath = new File("D:\\Tejas Shah\\Dropbox\\Tejas Shah's Workplace\\work\\spring-web-21-r\\src\\main\\webapp\\resources\\students\\"+path+"\\");
		myFilePath.mkdirs();//resources/students/12/
		
		File copyFile = new File(myFilePath,file.getOriginalFilename());

		
		try {
			copyFile.createNewFile();
			byte allBytes[] = file.getBytes();
			FileUtils.writeByteArrayToFile(copyFile, allBytes);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "\\resources\\students\\"+path+"\\"+file.getOriginalFilename();
	}

}
