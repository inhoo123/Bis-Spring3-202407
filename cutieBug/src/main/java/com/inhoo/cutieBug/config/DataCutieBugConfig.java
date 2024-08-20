package com.inhoo.cutieBug.config;

import com.inhoo.cutieBug.model.CutieBug;

public class DataCutieBugConfig {
	
	public final static String CUTIEBUG_URL ="http://apis.data.go.kr/6430000/mktPrcMntrIdtIstService/getMktPrcMntrIdtIst";// URL
	public final static String CUTIEBUG_API_KEY ="ADpF1vIamlNqL8poa0VpZW5SCJVXcLjwrfnD5TF5fMzC%2B166Nn7Aixn1D%2Fd5EWPpFbUH1F8jnJwm3PGRObYjbA%3D%3D"; // serviceKey
 public final static String	CURRENT_PAGE="1";//	currentPage 페이지 번호	8	1	1
 public final static String	PER_PAGE="10";//	perPage     한 페이지 결과 수	8	1	10

	/*
	 * 예:1) st = “1”이고 sw=“잠자리”일때 분류군국명에 “잠자리”을 포함하는 “물잠자리”가 검색됨 
	 * 예:2) st = “2”이고 sw=“Atro”일 때 분류군명에 “Atro”을 포함하는 “Atrocalopteryx”가 검색됨 
	 * 예:3) st = “3”이고 sw=”물잠자리”일때 일치하는 분류군국명 “물잠자리”가 검색됨
	 * 예:4) st = “4”이고 sw=" Atrocalopteryx"일때 일치하는 분류군명 “Atrocalopteryx”가 검색됨
	 */
}
