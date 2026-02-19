package ch04


/*
* 코틀린에서 상속을 다루는 방법
*
* 클래스를 상속받을 때 주의할 점
* 상위클래스를 설계할 때 생서자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다
*
* final: override를 할 수 없게 한다. default로 보이지 않게 존재
* open: override 열어준다
* abstract: 반드시 override 해야한다
* override : 상위 타입을 오버라이드 하고있다
* */

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
){
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}

