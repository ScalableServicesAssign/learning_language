package com.bitswilp.langLearn.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitswilp.langLearn.api.dao.LangResponseDao;
import com.bitswilp.langLearn.api.dto.LangLearnResponseDto;
import com.bitswilp.langLearn.api.dto.LangLearnResponseSubDto;

@Service
public class LangLearnService {
	
	@Autowired
	private LangResponseDao langRespDao;

	public String greeting() {
        return "Welcome to language learning Application";
    }
	
	public LangLearnResponseDto getLangId(String langId) {
        return langRespDao.getOrders(langId);
    }
	
	public LangLearnResponseSubDto getLangIdd(String langId) {
        return langRespDao.getOrdersSub(langId);
    }
}
