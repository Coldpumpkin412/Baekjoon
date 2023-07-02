# 대여중인 자동차정보 테이블 CAR_RENTAL_COMPANY_CAR
# 자동차 대여기록정보 테이블 CAR_RENTAL_COMPANY_RENTAL_HISTORY
# 자동차 종류 별 대여기간 종류 별 할인정책정보 테이블 CAR_RENTAL_COMPANY_DISCOUNT_PLAN
# 자동차종류가 세단 또는 SUV인 자동차 중, 2022년 11월1일~ 11월30일까지 대여가능하고,
# 30일간의 대여금액이 50만원 이상 200만원 미만인 자동차의
# 자동차ID, 자동차 종류, 대여금액(FEE)를 출력
# 대여금액(FEE) 기준 내림차순 정렬, 자동차종류 기준 오름차순정렬, 자동차ID기준 내림차순 정렬

SELECT CRCC.CAR_ID, CRCC.CAR_TYPE, ROUND(CRCC.DAILY_FEE*30*(100-DP.DISCOUNT_RATE)/100) AS FEE
FROM CAR_RENTAL_COMPANY_CAR AS CRCC
        INNER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS DP
        ON CRCC.CAR_TYPE = DP.CAR_TYPE
WHERE CRCC.CAR_TYPE IN('세단', 'SUV') AND DP.DURATION_TYPE = '30일 이상'
AND CRCC.CAR_ID NOT IN(
                        SELECT CAR_ID
                        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                        WHERE END_DATE > '2022-11-01' AND START_DATE < '2022-11-30'
                      )                   
HAVING FEE >= 500000 AND FEE < 2000000
ORDER BY FEE DESC, CRCC.CAR_TYPE ASC,  CRCC.CAR_ID DESC
                      
                      
                      