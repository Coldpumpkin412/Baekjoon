# 대여중인 자동차정보 테이블 CAR_RENTAL_COMPANY_CAR
# 자동차 대여기록정보 테이블 CAR_RENTAL_COMPANY_RENTAL_HISTORY
# 자동차 종류별 대여기간 종류별 할인정책정보 테이블 CAR_RENTAL_COMPANY_DISCOUNT_PLAN
# '트럭'의 대여기록 별 대여금액(FEE)을 구하여 대여기록ID, 대여금액 리스트를 출력
# 결과는 대여금액(FEE) 기준 내림차순 정렬, 대여기록ID 기준 내림차순
# DATEDIFF활용 (대여기간을 구할때는 +1을 해주어야 한다)
SELECT HISTORY_ID , CASE WHEN DIFF < 7 THEN ROUND(DAILY_FEE * DIFF)
                         WHEN DIFF < 30 THEN ROUND(DAILY_FEE * 0.95 * DIFF) 
                         WHEN DIFF < 90 THEN ROUND(DAILY_FEE * 0.92 * DIFF) 
                         ELSE  ROUND(DAILY_FEE * 0.85 * DIFF) END FEE
FROM (
        SELECT * 
        FROM CAR_RENTAL_COMPANY_CAR 
        WHERE CAR_TYPE = '트럭'
     ) AS C
    INNER JOIN (
                    SELECT  *, DATEDIFF(END_DATE, START_DATE)+1 AS DIFF 
                    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
               ) AS H
ON C.CAR_ID = H.CAR_ID
GROUP BY HISTORY_ID
ORDER BY FEE DESC, HISTORY_ID DESC
