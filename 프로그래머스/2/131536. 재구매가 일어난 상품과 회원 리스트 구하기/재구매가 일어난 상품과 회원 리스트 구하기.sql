-- 동일한 회원이 동일한 상품을 재구매한 데이터
-- 회원 ID를 기준으로 오름차순 정렬 / 회원 ID가 같다면 상품 ID를 기준으로 내림차순 정렬
SELECT USER_ID, PRODUCT_ID from ONLINE_SALE 
group by USER_ID, PRODUCT_ID
having (count( PRODUCT_ID ) >=2)
order by 1 asc , 2 desc