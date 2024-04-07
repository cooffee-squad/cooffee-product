package com.coffee.product.common.error

import com.coffee.product.common.error.type.ExceptionType
import org.springframework.http.ResponseEntity

class ErrorResponse(val statusCode: Int, val status: String, val errorCode: String, val message: String) {
    companion object {
        fun toResponse(exceptionType: ExceptionType): ResponseEntity<ErrorResponse> {
            return ResponseEntity
                .status(exceptionType.status)
                .body(
                    ErrorResponse(
                        exceptionType.status.value(),
                        exceptionType.name,
                        exceptionType.errorCode,
                        exceptionType.message,
                    ),
                )
        }
    }
}
