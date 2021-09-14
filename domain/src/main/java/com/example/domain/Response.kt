package com.example.domain

sealed class Response<out T> {
    data class Failure<T>(val error: Throwable) : Response<T>()
    data class Success<T>(val data: T) : Response<T>()
}