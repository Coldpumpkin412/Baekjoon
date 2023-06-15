SELECT A.BOOK_ID, B.AUTHOR_NAME, LEFT(A.PUBLISHED_DATE, 10) AS PUBLISHED_DATE
FROM BOOK AS A
    INNER JOIN AUTHOR AS B
    ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE A.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE ASC