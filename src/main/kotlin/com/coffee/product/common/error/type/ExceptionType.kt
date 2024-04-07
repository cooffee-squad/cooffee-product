package com.coffee.product.common.error.type

import org.springframework.http.HttpStatus

enum class ExceptionType(val status: HttpStatus, val errorCode: String, val message: String) {
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "UN0001", "권한이 없습니다"),
}
