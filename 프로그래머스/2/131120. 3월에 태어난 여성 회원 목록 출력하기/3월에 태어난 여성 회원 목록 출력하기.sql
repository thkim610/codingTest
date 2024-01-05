-- 회원의 ID, 이름, 성별, 생년월일을 조회
-- 조건 : 생일이 3월인 여성 회원, 전화번호 not null, 회원ID를 기준으로 오름차순 정렬
-- date_format(날짜 컬럼, 날짜 형식) =>  날짜 형식 변경 함수
-- '%Y-%m-%d' : yyyy-mm-dd 형식
SELECT MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, '%Y-%m-%d') 
from MEMBER_PROFILE
where gender = 'W' and TLNO is not null and month(DATE_OF_BIRTH) = 3
order by MEMBER_ID