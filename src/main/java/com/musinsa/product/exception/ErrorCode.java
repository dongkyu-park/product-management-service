package com.musinsa.product.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    BAD_REQUEST(HttpStatus.BAD_REQUEST, "요청에 잘못 된 입력 값이 존재 합니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "데이터를 찾을 수 없습니다."),
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "알 수 없는 서버 에러가 발생 했습니다."),
    INVALID_CATEGORY_NAME(HttpStatus.BAD_REQUEST, "존재하지 않는 카테고리명이 입력 되었습니다."),
    NOT_MATCH_COUNT_BRAND_WITH_CATEGORY(HttpStatus.BAD_REQUEST, "입력 된 브랜드명과 카테고리명의 갯수가 일치하지 않습니다."),
    MISSING_PARAM(HttpStatus.BAD_REQUEST, "요청에 필요한 파라미터 값이 입력되지 않았습니다.")
    ;

    private final HttpStatus httpStatus;
    private final String detail;
}
