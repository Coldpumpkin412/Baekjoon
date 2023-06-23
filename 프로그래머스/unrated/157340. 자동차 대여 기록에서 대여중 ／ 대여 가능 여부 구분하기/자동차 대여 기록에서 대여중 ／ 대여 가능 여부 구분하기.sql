# 테이블에서 2022년 10월 16일에 '대여중'인 자동차는 '대여중' 표시
# 2022년 10월 16일에 대여중이지 않은 자동차는 '대여기능'을 표시하는 컬럼(AVAILABILITY) 추가
# 자동차 ID와 AVAILABILITY 리스트 출력하는 SQL문 작성
# 반남 날짜가 2022년 10월 16일이어도 '대여중'으로 표시
# 자동차 ID 기준 내림차순 정렬

SELECT CAR_ID, IF(CAR_ID IN(
                    SELECT CAR_ID
                    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                    WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
                 ), '대여중', '대여 가능') AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC