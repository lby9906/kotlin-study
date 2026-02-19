package ch04

/*
* 익명클래스
* 자바에서는 new 타입이름()
* 코틀린에서는 object : 타입이름
* */

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable{
        override fun move() {
            println("무브무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })
}

class PersonV2 private constructor(
    var name: String,
    var age: Int,
) {

    //static 대신 companion object 사용
    //static : 클래스가 인스턴스화 될 때 새로운 값이 복제되는것이 아닌 정적으로 인스턴스끼리의 값 공유
    //companion object : 클래스와 동행하는 유일한 오브젝트 -> 하나의 객체로 간주(이름과 interface 상속도 가능)
    //const: 컴파일 시 변수가 할당됨 -> 진짜 상수에 붙이기 위한 용도(기본 타입과 string에 붙일 수 있음)
    companion object Factory : Log { //이름이 없다면 Companion | 있다면 PersonV2.Factory.newBaby() 호출
        private const val MIN_AGE = 1

        @JvmStatic // PersonV2.newBaby() 호출 가능
        fun newBaby(name: String): PersonV2 {
            return PersonV2(name, MIN_AGE)
        }

        override fun log() {
            println("나는 PersonV2 클래스의 동행객체 Factory에요")
        }
    }

}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}