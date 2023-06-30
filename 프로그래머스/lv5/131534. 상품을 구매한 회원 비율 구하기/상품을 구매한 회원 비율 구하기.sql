# 가입회원정보 테이블 USER_INFO
# 온라인 상품판매정보 테이블 ONLINE_SALE
# 2021년 가입 회원중 상품을 구매한 회원수와, 비율을 년 월 별로 출력
# 비율은 소수점 두번째 자리에서 반올림
# 년, 월을 기준 오름차순
SELECT YEAR(OS.SALES_DATE) AS YEAR, MONTH(OS.SALES_DATE) AS MONTH,
       COUNT(DISTINCT UI.USER_ID) AS PUCHASED_USERS,
       ROUND(COUNT(DISTINCT UI.USER_ID) / (SELECT COUNT(*)
                                           FROM USER_INFO
                                           WHERE JOINED LIKE '2021%'), 1) AS PUCHASED_RATIO
FROM USER_INFO AS UI
        INNER JOIN ONLINE_SALE AS OS
        ON UI.USER_ID = OS.USER_ID
WHERE UI.JOINED LIKE '2021%'
GROUP BY MONTH
ORDER BY YEAR, MONTH