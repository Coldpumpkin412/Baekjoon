# USED_GOODS_BOARD : 중고거래 게시판 정보 테이블
# USED_GOODS_FILE : 중고거래 게시판 첨부파일 정보 테이블
# 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로 조회 SQL문 작성
# FILE_ID 기준 내림차순 정렬
# 기본 파일경로는 /home/grep/src/ 
# 게시글 ID 기준 디렉토리 구분, 파일이름 : 파일ID, 파일이름, 파일확장자로 구성
SELECT CONCAT('/home/grep/src/', A.BOARD_ID, '/', B.FILE_ID, B.FILE_NAME, FILE_EXT) AS FILE_PATH
FROM USED_GOODS_BOARD AS A
    INNER JOIN USED_GOODS_FILE AS B
    ON A.BOARD_ID = B.BOARD_ID
WHERE A.VIEWS = (SELECT MAX(VIEWS)
                 FROM USED_GOODS_BOARD)
ORDER BY B.FILE_ID DESC