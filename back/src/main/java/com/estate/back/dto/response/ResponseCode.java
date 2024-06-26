package com.estate.back.dto.response;

// 200 성공 : SU / Success.
// 400 필수 데이터 미입력 : VF / Validation Failed.
// 400 중복된 아이디 : DI / Duplicated Id.
// 400 중복된 이메일 : DE / Duplicated Email.
// 401 로그인 정보 불일치 : SF / Sign in Failed.
// 401 인증 실패 : AF / Authentication Failed.
// 500 토큰 생성 실패 :TF / Token creation Failed.
// 500 이메일 전송 실패 : MF / Mail send Failed.
// 500 데이터베이스 오류 : DBE / Database Error.

// Response의 공통된 code 값
public interface ResponseCode {
    String SUCCESS = "SU";
    String VALIDATION_FAIL = "VF";
    String DUPLICATE_ID = "DI";
    String DUPLICATE_EMAIL = "DE";
    String NO_EXIST_BOARD = "NB";
    String WRITTEN_COMMENT = "WC";
    String SIGN_IN_FAIL = "SF";
    String AUTHENTICATION_FAIL = "AF";
    String AUTHORIZATION_FAIL = "AF";
    String NOT_FOUND = "NF";
    String TOKEN_CREATION_FAIL = "TF";
    String MAIL_SEND_FAIL = "MF";
    String DATABASE_ERROR = "DBE";
}
