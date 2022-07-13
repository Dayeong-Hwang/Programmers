package level4;

public class MySQL {
//	1. 우유와 요거트가 담긴 장바구니
//	https://hello-i-t.tistory.com/117
//	https://blue-boy.tistory.com/194
//	
//	SELECT DISTINCT A.CART_ID
//	FROM CART_PRODUCTS A JOIN CART_PRODUCTS B
//	ON A.CART_ID = B.CART_ID
//	WHERE A.NAME = "Yogurt" AND B.NAME = "Milk"
//	ORDER  BY A.CART_ID ASC;
	
	
	
//	2. 보호소에서 중성화한 동물
//	https://kunduz.tistory.com/entry/Programmers-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-59045-%EB%B3%B4%ED%98%B8%EC%86%8C%EC%97%90%EC%84%9C-%EC%A4%91%EC%84%B1%ED%99%94%ED%95%9C-%EB%8F%99%EB%AC%BC-MySQL
//  https://ckd2806.tistory.com/entry/mysql-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%B3%B4%ED%98%B8%EC%86%8C%EC%97%90%EC%84%9C-%EC%A4%91%EC%84%B1%ED%99%94%ED%95%9C-%EB%8F%99%EB%AC%BC
//	https://mjs1995.tistory.com/150
//  https://mungto.tistory.com/282
//	
//	SELECT A.ANIMAL_ID, A.ANIMAL_TYPE,A.NAME
//	FROM ANIMAL_INS A  LEFT JOIN ANIMAL_OUTS B
//	ON A.ANIMAL_ID = B.ANIMAL_ID
//	WHERE A.SEX_UPON_INTAKE LIKE "Intact%" AND B.SEX_UPON_OUTCOME NOT LIKE "Intact%"
//	ORDER BY A.ANIMAL_ID;
	
	
	
	
//	3. 입양 시각 구하기(2)
//	https://chanhuiseok.github.io/posts/db-6/
//	https://velog.io/@ljs7463/MySQL-%EC%9E%85%EC%96%91-%EC%8B%9C%EA%B0%81-%EA%B5%AC%ED%95%98%EA%B8%B02
	
//	SET @HOUR := -1;
//
//	SELECT (@HOUR := @HOUR +1) AS HOUR,
//	(SELECT COUNT(*) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @hour) as COUNT
//	FROM ANIMAL_OUTS
//	WHERE @hour < 23
//	ORDER BY @HOUR ASC;


	
	
	
}