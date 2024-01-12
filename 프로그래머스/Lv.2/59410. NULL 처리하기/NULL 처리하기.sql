-- 동물의 생물 종, 이름, 성별 및 중성화 여부를 아이디 순으로 조회
-- 이름이 없는 동물은 'No name'
-- IFNULL(컬럼명, 바꿀 데이터 값)
SELECT ANIMAL_TYPE, IFNULL(NAME, 'No name'), SEX_UPON_INTAKE from ANIMAL_INS
order by ANIMAL_ID