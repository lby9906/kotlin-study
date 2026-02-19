package ch04

/*
* 코틀린에서 중첩 클래스를 다루는 방법
* */

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
   inner class LivingRoom(
        private val area: Double
    ) {
       val address: String
           get() = this@House.address //바깥 클래스를 참조하려면 inner 키워드 추가
   }
}