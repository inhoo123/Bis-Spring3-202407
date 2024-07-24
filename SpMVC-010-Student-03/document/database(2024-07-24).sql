-- 여기는 schoolUser 화면-- 
USE schoolDB;
SHOW TABLES;
DESC tbl_score;
DESC tbl_student;
DESC tbl_subject;

SELECT COUNT(*) FROM tbl_score;
SELECT * FROM tbl_score;

SELECT COUNT(*) FROM tbl_student;
SELECT * FROM tbl_student;

SELECT * FROM tbl_subject;
/*
학생벙보, 성적, 과목정보 3개의 Table의
데이터를 import 한 후
다음의 참조 무결성 설정(FK 생성)을 하기위해
먼저 참조 무결성이 성립되는지 검증하기
FK 를 설정할 대상
학생정보 : 성적,과목정보 : 성적,과목정보:
*/
-- 참조무결성(FK)를 설정 두 table 을
-- LEFT JOIN 하여 NULL 값이 존재하는지 검증
-- 만약 결과에 NULL 이 있다면 FK 설정 불가
SELECT *
FROM tbl_score
	  LEFT JOIN tbl_student
			on sc_stnum = st_num
 WHERE st_num IS NULL;           
 SELECT *
 FROM tbl_score
		LEFT JOIN tbl_subject
				ON sc_sbcode = sb_code
 WHERE sb_code IS NULL;      
 
 -- 참조무결성을 유지하기 위하여 FK 설정하는것
 -- FK는 1:N 의 관계에서 설정하며
 -- N 의 Table 에 FK 를 설정한다
 ALTER TABLE tbl_score 			    -- 성적테이블에 FK를 설정
 ADD CONSTRAINT FK_student     -- FK 의 이름
 FOREIGN KEY (sc_stnum)            -- 성적테이블의 FK 칼럼
 REFERENCES tbl_student(st_num)	-- 누구 (table)와
 ON DELETE CASCADE  --
 ON UPDATE CASCADE; -- 누구(table) 와
 
 DROP TABLE FK_student;
 
 ALTER TABLE tbl_score
 ADD CONSTRAINT FK_subject
 FOREIGN KEY (sc_sbcode)
 REFERENCES tbl_subject(sb_code);
 
 -- 완전 JOIN SQL
 -- Table 간에 FK 가 완전하게 유지되는 경우
 -- 사용할수 있는 Query
 SELECT *
 FROM tbl_student,tbl_subject,tbl_score
		WHERE st_num = sc_stnum AND sb_code = sc_sbcode;
 
 -- EQ, Inner Join
 -- 테이블간에 FK 가 설정되고 참조무결성관계가
 -- 유지되는 경우 사용하는 Query
    SELECT *
    FROM tbl_score
    JOIN tbl_studnet
		ON sc_stnum = st_num
        JOIN tbl_subject
        ON sc_sbcode = sc_code;
        
 DESC tbl_student;
 DESC tbl_subject;
 
 SELECT * FROM tbl_score;
 DROP VIEW view_scores;
 CREATE VIEW view_score
 
 (
 SELECT SC.*,SB.sb_name
 FROM tbl_score SC
		JOIN tbl_subject SB
			ON sc_sbcode = sb_code
            )