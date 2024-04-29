package com.coffee.product.common.error

import com.coffee.product.common.error.type.ExceptionType

class CustomException(val exceptionType: ExceptionType) : RuntimeException()
