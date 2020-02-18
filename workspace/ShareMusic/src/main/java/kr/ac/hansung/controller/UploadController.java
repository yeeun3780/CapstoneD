package kr.ac.hansung.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.ac.hansung.service.CollectionService;
import kr.ac.hansung.service.OCRService;

@Controller
public class UploadController {

	@Autowired
	private OCRService ocrService;
	@Autowired
	private CollectionService collectionService;

	@RequestMapping( "/upload" )
	public String upload(
			Model model,
			@RequestParam("email") String email,
			@RequestParam("file1") MultipartFile file) {
		
		List<String> collectionList = ocrService.getTesseract(file);
	
		collectionService.insert(collectionList);
		
		model.addAttribute("collectionList",collectionList);
		
		return "result";
	}
	


}
