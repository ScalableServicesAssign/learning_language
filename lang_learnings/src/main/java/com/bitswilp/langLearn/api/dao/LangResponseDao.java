package com.bitswilp.langLearn.api.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bitswilp.langLearn.api.dto.LangLearnResponseDto;
import com.bitswilp.langLearn.api.dto.LangLearnResponseSubDto;


@Component
public class LangResponseDao {
	
	public LangLearnResponseDto getOrders(String langId) {
        return generateRandomOrders().get(langId);
    }

    private Map<String, LangLearnResponseDto> generateRandomOrders() {
        Map<String, LangLearnResponseDto> orderMap = new HashMap<>();
        orderMap.put("35fds631", new LangLearnResponseDto("35fds63", "Karthik","Hindi"));
        orderMap.put("9u71245h", new LangLearnResponseDto("9u71245h", "Madhu","Spanish"));
        orderMap.put("37jbd832", new LangLearnResponseDto("37jbd832", "Ujwal","Spanish"));
        orderMap.put("37jbd831", new LangLearnResponseDto("37jbd831", "Farz","French"));
        orderMap.put("37jbd834", new LangLearnResponseDto("37jbd834", "mallika","Malayalam"));
        orderMap.put("37jbd835", new LangLearnResponseDto("37jbd835", "Surab","Mangolia"));
        return orderMap;
    }
    
    public LangLearnResponseSubDto getOrdersSub(String langId) {
        return generateRandomOrdersSub().get(langId);
    }
	
    private Map<String, LangLearnResponseSubDto> generateRandomOrdersSub() {
        Map<String, LangLearnResponseSubDto> orderMapp = new HashMap<>();
        orderMapp.put("35fds631", new LangLearnResponseSubDto("35fds63", "Karthik","Hindi","Basic"));
        orderMapp.put("9u71245h", new LangLearnResponseSubDto("9u71245h", "Madhu","Spanish","Basic"));
        orderMapp.put("37jbd832", new LangLearnResponseSubDto("37jbd832", "Ujwal","Spanish","Premium"));
        orderMapp.put("37jbd831", new LangLearnResponseSubDto("37jbd831", "Farz","French","Premium"));
        orderMapp.put("37jbd834", new LangLearnResponseSubDto("37jbd834", "mallika","Malayalam","Basic"));
        orderMapp.put("37jbd835", new LangLearnResponseSubDto("37jbd835", "Surab","Mangolia","Basic"));
        return orderMapp;
    }

}
