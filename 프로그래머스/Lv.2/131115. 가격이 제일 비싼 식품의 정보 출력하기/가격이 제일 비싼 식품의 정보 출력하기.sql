-- 가격이 제일 비싼 식품의 식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을 조회
-- 서브쿼리를 통해 최대 가격 구하기
SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
from FOOD_PRODUCT
where price = (select max(price) from FOOD_PRODUCT)