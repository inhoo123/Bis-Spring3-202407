package com.inhoo.cutieBug.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CutieBug {
public String	perPage	;//한 페이지 결과 수	8	1	10	한 페이지 결과 수
public String	resultCode	;//결과코드	2	1	0	결과코드
public String	totalRows	;//데이터 총 개수	8	1	3	데이터 총 개수
public String	currentPage	;//페이지 번호	8	1	1	페이지 번호
public String	resultMsg	;//결과메세지	50	1	NORMAL SERVICE	결과메시지
public String	SE	;// 구분 191	1	1	구분
public String	INSECT_NM	;//곤충 명	7	1	갈색거저리	곤충 명
public String	STLE	;//형태	2	1	생체	형태
public String	WT	;//무게	3	1	1kg	무게
public String	AMOUNT	;//금액	8	1	30000	금액
public String	CMPR	;//비교	2	1	식용	비교


}
