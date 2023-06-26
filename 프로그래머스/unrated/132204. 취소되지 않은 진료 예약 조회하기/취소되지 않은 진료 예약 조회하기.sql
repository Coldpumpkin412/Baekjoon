# 환자 정보 테이블 PATIENT
# 의사 정보 테이블 DOCTOR
# 진료예약목록 테이블 APPOINTMENT
# 2022년 4월 13일 취소되지않은 흉부외과(CS) 진료예약내역 조회
# 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 출력
# 진료예약일시 기준 오름차순 정렬
SELECT AP.APNT_NO, PT.PT_NAME, PT.PT_NO, AP.MCDP_CD, DR.DR_NAME, AP.APNT_YMD
FROM PATIENT AS PT
        INNER JOIN APPOINTMENT AS AP
        ON PT.PT_NO = AP.PT_NO
        INNER JOIN DOCTOR AS DR
        ON AP.MDDR_ID = DR.DR_ID
WHERE AP.APNT_YMD LIKE '2022-04-13%' AND AP.APNT_CNCL_YN = 'N'
ORDER BY AP.APNT_YMD ASC