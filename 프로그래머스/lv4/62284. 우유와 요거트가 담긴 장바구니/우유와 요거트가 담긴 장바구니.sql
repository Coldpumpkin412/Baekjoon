# 장바구니에 담긴 상품 정보 테이블 CART_PRODUCTS
# 우유와 요거트를 동시에 구입한 장바구니의 아이디 조회
# 장바구니 아이디 순으로 조회
SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME IN ('Milk', 'Yogurt')
GROUP BY CART_ID
HAVING COUNT(DISTINCT NAME) >= 2
ORDER BY CART_ID