-- ITEM_INFO 테이블에서 희귀도가 'LEGEND'인 아이템들의 가격의 총합을 구하는 SQL문을 작성
-- 컬럼명은 'TOTAL_PRICE'로 지정
SELECT SUM(PRICE) AS TOTAL_PRICE FROM ITEM_INFO
WHERE RARITY = 'LEGEND';