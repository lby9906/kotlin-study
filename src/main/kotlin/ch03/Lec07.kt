package ch03

import kotlin.NumberFormatException


/*
* 코틀린에서 예외를 다루는 방법
* try catch finally 구문
* checked exception / unchecked exception
* try with resources
*
* try catch finally 구문
* 주어진 문자열을 정수로 변경하는 예제
* 주어진 문자열을 정수로 변경하는 예제 -> 실패시 null 반환
* */


/*
* 기본 타입간 형변환 toType()사용
* new 사용x
* 타입이 뒤에 나옴
* */
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try { //expression
        return str.toInt()
    }catch (e: NumberFormatException) {
        null
    }


}