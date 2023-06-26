# FOOD_PRODUCT 테이블에서 '식품분류별로' 가격이 제일 비싼 식품의
# 분류, 가격, 이름을 조회
# 이때 식품 분류가 과자, 국, 김치, 식용유인 경우만 출력
# 결과는 식품가격 기준 내림차순
SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE (CATEGORY, PRICE) IN (
                            SELECT CATEGORY, MAX(PRICE)
                            FROM FOOD_PRODUCT
                            GROUP BY CATEGORY
                            HAVING CATEGORY IN ('과자', '김치', '국', '식용유')
                            )
ORDER BY MAX_PRICE DESC