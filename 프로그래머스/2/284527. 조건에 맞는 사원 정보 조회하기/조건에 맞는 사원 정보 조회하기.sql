-- 2022년도 평가 점수가 가장 높은 사원들의 점수, 사번, 성명, 직책, 이메일을 조회하는 SQL문을 작성
-- 2022년도의 평가 점수는 상,하반기 점수의 합을 의미하고, 평가 점수를 나타내는 컬럼의 이름은 SCORE
SELECT SUM(B.SCORE) AS SCORE, A.EMP_NO, EMP_NAME, POSITION, EMAIL
FROM HR_EMPLOYEES A INNER JOIN HR_GRADE B
ON (A.EMP_NO = B.EMP_NO)
GROUP BY A.EMP_NO
ORDER BY SCORE DESC
LIMIT 1;