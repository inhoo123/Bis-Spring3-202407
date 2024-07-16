package com.callor.student.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVO {

	private String st_num;
	private String st_name;
	private String st_dept;
	private String st_grade;
	private String st_tel;
	private String st_adress;
	
}
