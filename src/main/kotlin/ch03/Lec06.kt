package ch03

/*
* 코틀린에서 반복문을 다루는 방법
* for-each문 -> 향상된 for문
* 전통적인 for문
* Progression과 Range
* while문
*
* for-each문
* 숫자가 들어있는 리스트를 하나씩 출력하는 예제
* : 대신 in을 사용*
* lterable이 구현된 타입이라면 모두 들어갈 수 있음
*
*
* 전통적인 for문
* .. : 범위를 나타내는 연산자
* 등차수열을 사용
*
* Progression과 Range
* 3 downTo 1 : 시작값 3, 끝값 1, 공차가 -1인 등차수열
* 1..5 step 2 : 시작값 1, 끝값 5, 공차가 2인 등차수열
* downTo, step -> 함수(중위함수)
*
* while문
* 자바와 동일
* do-while도 마찬가지로 동일
* */

fun forEachMain() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}

fun forMain() {
    for (i in 1..3) { //1..3은 1~3까지 올라간다
        println(i)
    }

    for (i in 3 downTo 1) { //1..3은 1~3까지 내려간다
        println(i)
    }

    for (i in 1..5 step 2) { //1..5까지 2씩 올라간다
        println(i)
    }
}