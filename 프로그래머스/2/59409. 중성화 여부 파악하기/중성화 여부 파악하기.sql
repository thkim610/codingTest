-- case 문을 활용하여 중성화 여부 O,X로 표시
SELECT ANIMAL_ID, NAME, 
    CASE
        WHEN SEX_UPON_INTAKE LIKE '%Neutered%' 
        THEN 'O'
        WHEN SEX_UPON_INTAKE LIKE '%Spayed%'
        THEN 'O'
        ELSE 'X'
    END as '중성화'
FROM ANIMAL_INS  
ORDER BY ANIMAL_ID