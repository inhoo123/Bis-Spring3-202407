package com.inhoo.cutieBug.service.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.inhoo.cutieBug.config.DataCutieBugConfig;
import com.inhoo.cutieBug.model.CutieBug;
import com.inhoo.cutieBug.model.CutieBugList;
import com.inhoo.cutieBug.service.CutieBugService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CutieBugServiceImpl implements CutieBugService {
	@Override
	public List<CutieBug> getBugNames(String systemkorname) {
// 요청메세지 	
		String sw ="&sw="+DataCutieBugConfig.CUTIEBUG_SW; //							검색어
		String st ="&st="+DataCutieBugConfig.CUTIEBUG_ST; //							검색어 구분
		String numOfRows = "&numOfRows="+DataCutieBugConfig.CUTIEBUG_NUM_OF_ROWS; // 	한 페이지 결과 수
		String pageNo = "&pageNo="+DataCutieBugConfig.CUTIEBUG_PAGE_NO; //				페이지 번호
		String apiURI = DataCutieBugConfig.CUTIEBUG_URL+"/systemSearch";//				URL
		String key ="?ServiceKey="+DataCutieBugConfig.CUTIEBUG_API_KEY;//				key
		apiURI+=key+st+sw+numOfRows+pageNo;
		log.debug("API URL{}=",apiURI);
/* 요청메세지 예제
 * http://apis.data.go.kr/6430000/mktPrcMntrIdtIstService/getMktPrcMntrIdtIst?serviceKey=인증키(URL Encode)&currentPage=1&perPage=10
 */
// key try catch
		URI cutieBugURI = null;		
		try {
			cutieBugURI = new URI(apiURI);
		} catch (URISyntaxException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// template
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getInterceptors().add((request, body, execution) -> {
			ClientHttpResponse response = execution.execute(request, body);
			response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
			return response;
		});
		ResponseEntity<CutieBugList> cutieBugListEntity = null;
		cutieBugListEntity = restTemplate.exchange(cutieBugURI,
				HttpMethod.GET, null, CutieBugList.class);
		//filtering
		List<CutieBug> cutieBugList = cutieBugListEntity.getBody().CutieBug_List;
		if (!systemkorname.isEmpty()) {
			cutieBugList = cutieBugList.stream().filter(bug -> bug.systemkorname.contains(systemkorname))
					.collect(Collectors.toList());
		}
		log.debug("받은데이터{}", cutieBugList.toString());
		return cutieBugList;
	}

}
