package ch04

/*
* data class : 계층간의 데이터를 전달하기 위한 dto
* 데이터 필드
* 생성자와 getter
* equals, hashcode
* toString
* data를 붙이면 equals, hascode, toString 다 만들어줌
*
*
*
* sealed class : 컴파일 타임 때 하위 클래스의 타입을 모두 기억 / 런타임 때 클래스 타입 추가될 필요 없음 / 하위 클래스는 같은 패키지에 있어야한다.
* sealws interface :
* */

fun main() {
    val dto1 = PersonDto("최태현", 100)
    val dto2 = PersonDto("최태현", 200)
    println(dto1 == dto2)
}

data class PersonDto(
    val name: String,
    val age: Int,
)

fun handleCountry(country: Country) {
    return when(country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
    ;
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

