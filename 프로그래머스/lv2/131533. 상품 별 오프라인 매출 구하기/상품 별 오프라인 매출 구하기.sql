SELECT A.PRODUCT_CODE, SUM(A.PRICE * B.SALES_AMOUNT) AS SALES
FROM PRODUCT AS A
    INNER JOIN OFFLINE_SALE AS B
    ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_ID
ORDER BY SALES DESC, A.PRODUCT_CODE ASC
