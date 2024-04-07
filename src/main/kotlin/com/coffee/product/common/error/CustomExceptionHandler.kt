package com.coffee.product.common.error

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

private val log = LoggerFactory.getLogger(CustomExceptionHandler::class.java)

@RestControllerAdvice
class CustomExceptionHandler {
    @ExceptionHandler(CustomException::class)
    protected fun handleCustomException(e: CustomException): ResponseEntity<ErrorResponse> {
        val exceptionType = e.exceptionType
        log.error("Exception Throw {}", exceptionType)
        return ErrorResponse.toResponse(exceptionType)
    }
}
