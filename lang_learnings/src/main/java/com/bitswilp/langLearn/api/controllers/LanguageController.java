package com.bitswilp.langLearn.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitswilp.langLearn.api.dto.LangLearnResponseDto;
import com.bitswilp.langLearn.api.dto.LangLearnResponseSubDto;
import com.bitswilp.langLearn.api.service.LangLearnService;


@RestController
@RequestMapping("/profilelang")
public class LanguageController {
	
	@Autowired
	private LangLearnService langSer;
	
	@GetMapping("/greet")
    public String greetingMessage() {
        return langSer.greeting();
    }
 
 
 @GetMapping("/{langId}")
    public LangLearnResponseDto getOrder(@PathVariable String langId) {
        return langSer.getLangId(langId);
    }
 
 @GetMapping("/sub/{langId}")
 public LangLearnResponseSubDto getSubOrder(@PathVariable String langId) {
     return langSer.getLangIdd(langId);
 }

}
