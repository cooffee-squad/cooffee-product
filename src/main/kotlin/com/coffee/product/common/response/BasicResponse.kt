package com.coffee.product.common.response

import org.springframework.http.HttpStatus

data class BasicResponse<T>(
    var statusCode: Int = 200,
    var status: HttpStatus = HttpStatus.OK,
    var data: T? = null,
) {
    companion object {
        fun <T> ok(data: T): BasicResponse<T> {
            return BasicResponse(HttpStatus.OK.value(), HttpStatus.OK, data)
        }

        fun <T> created(data: T): BasicResponse<T> {
            return BasicResponse(HttpStatus.CREATED.value(), HttpStatus.CREATED, data)
        }

        fun <T> badRequest(data: T): BasicResponse<T> {
            return BasicResponse(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, data)
        }

        fun <T> notFound(data: T): BasicResponse<T> {
            return BasicResponse(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, data)
        }

        fun <T> internalServerError(data: T): BasicResponse<T> {
            return BasicResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR, data)
        }
    }
}
