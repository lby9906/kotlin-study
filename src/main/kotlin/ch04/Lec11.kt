package ch04

/*
* 코틀린에서 접근 제어를 다루는 방법
*
* 자바와 코틀린의 가시성 제어
* public : 모든 곳 접근 가능
* protected: 선언된 클래스 또는 하위 클래스에서만 접근 가능(같은 패키지 x) -> 패키지 namespace를 관리하기 위한 용도로만 사용 => 파일 최상단에는 사용 불가능
* internal : 같은 모듈에서만 접근 가능(모듈: 한번에 컴파일되는 코틀린 코드 -> maven, gradle, ...)
* private : 선언된 클래스 내에서만 접근 가능
*
* 코틀린은 패키지 접근 제어 사용 x
* default 없고, protected 바뀜, internal
*
* 코틀린 기본 접근 지시어 public
*
* 다양한 구성요소의 접근 제어 - 클래스 안 멤버
* 생성자에 접근 지시어 붙이려면, constructor 붙여야함
*
* */

val a = 3

fun add(a: Int, b:Int): Int {
    return a+b
}

//open class Cat private constructor()

class Car(
    internal val name: String, //name에 대한 getter를 internal로 선언
    private var owner: String, //getter + setter를 다 private 선언
    _price: Int
) {
    var price = _price
        private set //setter는 private, getter는 public
}