# 아이스크림 상반기 주문 정보 테이블 FIRST_HALF
# 7월 아이스크림 주문정보 테이블 JULY
# 7월 아이스크림 총 주문량 + 상반기 아이스크림 총 주문량이 큰 순서대로
# 상위 3개의 맛을 작성
SELECT FH.FLAVOR AS FLAVOR
FROM FIRST_HALF AS FH
        INNER JOIN JULY AS J
        ON FH.FLAVOR = J.FLAVOR
GROUP BY FLAVOR
ORDER BY SUM(FH.TOTAL_ORDER) + SUM(J.TOTAL_ORDER) DESC
LIMIT 3