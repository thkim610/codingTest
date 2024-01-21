-- 상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별 상품 개수를 출력
-- 상품 카테고리 코드를 기준으로 오름차순 정렬
SELECT left(PRODUCT_CODE, 2) as 'CATEGORY', count(PRODUCT_ID) as 'PRODUCTS'
from PRODUCT
group by left(PRODUCT_CODE, 2)
order by left(PRODUCT_CODE, 2) asc;