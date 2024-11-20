package com.bitswilp.langLearn.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LangLearnResponseDto {
	
	private String langId;
	private String name;
	private String language;
	

}
