# CAR_RENTAL_COMPANY_RENTAL_HISTORY 자동차 대여기록 정보 테이블
# 대여시작일 기준, 2022-08 ~ 2022-10 까지 대여횟수가 5회 이상인 자동차들에 대해
# 해당 기간동안 월 별 자동차 ID 별 총 대여 횟수(RECORDS) 리스트 출력
# 월을 기준으로 오름차순 정렬, 같으면 자동차ID 기준 내림차순 정렬
# 특정 월의 총 대여 횟수가 0인 경우 결과에서 제외

SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE (START_DATE BETWEEN '2022-08-01' AND '2022-11-01')
        AND (CAR_ID IN (
                        SELECT CAR_ID
                        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                        WHERE START_DATE BETWEEN '2022-08-01' AND '2022-11-01'
                        GROUP BY CAR_ID
                        HAVING COUNT(CAR_ID) >= 5
                        )
             )
GROUP BY MONTH, CAR_ID
HAVING RECORDS > 0
ORDER BY MONTH ASC, CAR_ID DESC