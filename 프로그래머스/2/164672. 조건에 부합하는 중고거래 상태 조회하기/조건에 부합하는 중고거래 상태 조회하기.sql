-- USED_GOODS_BOARD 테이블에서 2022년 10월 5일에 등록된 중고거래 게시물의 게시글 ID, 작성자 ID, 게시글 제목, 가격, 거래상태를 조회하는 SQL문을 작성
-- 거래상태가 SALE 이면 판매중, RESERVED이면 예약중, DONE이면 거래완료 분류하여 출력
--  게시글 ID를 기준으로 내림차순
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE,
    CASE STATUS WHEN 'DONE' THEN '거래완료' WHEN 'RESERVED' THEN '예약중' ELSE '판매중' END
    AS STATUS
FROM USED_GOODS_BOARD
WHERE CREATED_DATE = '2022-10-05'
ORDER BY 1 DESC;