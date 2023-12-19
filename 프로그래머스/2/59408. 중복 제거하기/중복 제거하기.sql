-- 중복제거 => distinct(컬럼명), null 허용x => is not null
SELECT count(distinct(name)) from ANIMAL_INS where name is not null;