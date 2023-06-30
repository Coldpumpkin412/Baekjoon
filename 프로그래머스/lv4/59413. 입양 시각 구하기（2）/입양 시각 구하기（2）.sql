# 입양보낸 동물의 정보 테이블 ANIMAL_OUTS
# 0시~23시까지, 각 시간대 별 입양 건수 조회
# 시간대 순으로 정렬

# WITH를 사용하여 메모리상에 가상의 테이블 저장(RECURSIVE 활용하여 재귀표현)

WITH RECURSIVE HR AS(
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1 
    FROM HR
    WHERE HOUR<23
), HR2 AS(
    SELECT HOUR(DATETIME) AS HOUR, COUNT(ANIMAL_ID) AS CNT
    FROM ANIMAL_OUTS
    GROUP BY HOUR
)

SELECT HR.HOUR, CASE WHEN HR2.CNT IS NULL THEN 0
                                          ELSE CNT
                                          END AS CNT
FROM HR
    LEFT JOIN HR2
    ON HR.HOUR = HR2.HOUR
ORDER BY HOUR ASC