-- 각 동물의 아이디와 이름, 들어온 날짜를 조회
-- 아이디 순으로 조회
-- DATE_FORMAT(컬럼명, 날짜 형식) (yyyy-mm-dd => %Y-%m-%d)
SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') from ANIMAL_INS
order by ANIMAL_ID