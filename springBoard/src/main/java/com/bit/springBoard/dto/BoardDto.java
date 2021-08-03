package com.bit.springBoard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class BoardDto {

	private int id;
	private String name;
	private String title;
	private String content;
	private String regdate;
	private int hit;
	
}



