-- 2022년 1월의 카테고리 별 도서 판매량을 합산하고, 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력
-- 카테고리명을 기준으로 오름차순 
SELECT CATEGORY, SUM(SALES) as TOTAL_SALES
FROM BOOK RIGHT JOIN BOOK_SALES 
ON BOOK.BOOK_ID = BOOK_SALES.BOOK_ID
WHERE BOOK_SALES.SALES_DATE BETWEEN TO_DATE('2022-01-01', 'YYYY-MM-DD')
AND TO_DATE('2022-01-31', 'YYYY-MM-DD')
GROUP BY BOOK.CATEGORY 
ORDER BY BOOK.CATEGORY ASC
