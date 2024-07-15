package com.callor.hello.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StudentVO {
	private String ST_NUM;// NVARCHAR2(125 CHAR)
	private String ST_NAME;// NVARCHAR2(20 CHAR)
	private String ST_DEPT;// NUMBER
	private int ST_GRADE;// NVARCHAR2(20 CHAR)
	private String ST_TEL;// VARCHAR2(5 BYTE)
	private String ST_ADRESS;// NVARCHAR2(20 CHAR)
}
