package level3;

public class MySQL {
	//없어진 기록 찾기
//	SELECT A.ANIMAL_ID, A.NAME 
//	FROM ANIMAL_OUTS A
//	LEFT JOIN ANIMAL_INS B 
//	ON A.ANIMAL_ID = B.ANIMAL_ID
//	WHERE B.ANIMAL_ID IS NULL
//	ORDER BY A.ANIMAL_ID;


//	SELECT ANIMAL_ID
//    , NAME
// FROM ANIMAL_OUTS
//WHERE ANIMAL_ID NOT IN (SELECT ANIMAL_ID FROM ANIMAL_INS)
////ORDER BY ANIMAL_ID, NAME
	
//	ANIMAL_INS 와 ANIMAL_OUTS 를 ANIMAL_ID가 같은 것을 기준으로 RIGHT OUTER JOIN 하면,
//	ANIMAL_OUTS에 존재하는 ANIMAL_ID와 같은 ANIMAL_INS의 ANIMAL_ID가 JOIN된다.
//	여기서 입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물의 ID를 조회하려면,
//	ANIMAL_INS테이블에 같은 ANIMAL_ID가 존재하지 않는 즉, NULL값을 찾으면 된다.
	
	
	
	//있었는데요 없었습니다 (더빠르다? 헷갈리면 숫자 대입해서 2보다 1이 빠르네? 라고 생각하기)
//	SELECT A.ANIMAL_ID, A.NAME
//	FROM ANIMAL_INS A JOIN ANIMAL_OUTS B
//	ON A.ANIMAL_ID = B.ANIMAL_ID
//	WHERE B.DATETIME < A.DATETIME
//	ORDER BY A.DATETIME ASC;
	
	
	//헤비 유저가 소유한 장소
//	SELECT ID,NAME,HOST_ID
//	FROM PLACES
//	WHERE HOST_ID IN  ->>> 2개 이상일때를 조회. 그래서 서브쿼리로! 
//	(SELECT HOST_ID FROM PLACES GROUP BY HOST_ID HAVING COUNT(HOST_ID) >1)
//	ORDER BY ID ASC;
	
//	SELECT *
//	FROM PLACES PL1 
//	WHERE PL1.HOST_ID IN (
//	                        SELECT HOST_ID
//	                        FROM PLACES
//	                        GROUP BY HOST_ID
//	                        HAVING COUNT(*) > 1
//	                     )
//	ORDER BY ID;
	
	
	
	//오랜 기간 보호한 동물(1)
//	SELECT A.NAME, A.DATETIME
//	FROM ANIMAL_INS A LEFT JOIN ANIMAL_OUTS B
//	ON A.ANIMAL_ID = B.ANIMAL_ID
//	WHERE B.ANIMAL_ID IS NULL
//	ORDER BY A.DATETIME ASC LIMIT 3;

// 참고 블로그 : https://it-jin-developer.tistory.com/42
	
	
	//오랜 기간 보호한 동물(2)
	//DATEDIFF 함수도 있음
//	SELECT A.ANIMAL_ID, A.NAME
//	FROM ANIMAL_INS A LEFT JOIN ANIMAL_OUTS B
//	ON A.ANIMAL_ID = B.ANIMAL_ID
//	ORDER BY B.DATETIME - A.DATETIME DESC LIMIT 2;
	
	
}
