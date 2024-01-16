-- 고양이와 개가 각각 몇 마리인지 조회
-- 고양이를 개보다 먼저 조회
-- 정렬 조건이 있으면, 데이터의 변경이 일어날 때 순서가 보장되지 않으므로 반드시 order by를 사용한다.
SELECT ANIMAL_TYPE, count(ANIMAL_TYPE) as'count' from ANIMAL_INS
group by ANIMAL_TYPE
having ANIMAL_TYPE in ('Cat', 'Dog')
order by 1