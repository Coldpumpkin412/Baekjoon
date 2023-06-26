# 식당 정보 테이블 REST_INFO
# 식당 리뷰 정보 테이블 REST_REVIEW
# 서울에 위치한 식당들의 식당ID, 식당이름, 음식종류, 즐겨찾기수, 주소, 리뷰평균점수 조회
# 리뷰평균점수는 소수점 3번째 자리에서 반올림
# 결과는 평균점수 기준 내림차순, 즐겨찾기 수 기준 내림차순

SELECT A.REST_ID, A.REST_NAME, A.FOOD_TYPE, A.FAVORITES, A.ADDRESS, ROUND(AVG(B.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO AS A
        INNER JOIN REST_REVIEW AS B
        ON A.REST_ID = B.REST_ID
WHERE A.ADDRESS LIKE '서울%'
GROUP BY A.REST_ID
ORDER BY SCORE DESC, A.FAVORITES DESC
