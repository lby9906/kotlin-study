package ch06

/*
* Type Alias : 긴 이름의 클래스 혹은 함수 타입이 있을때 축약하거나 더 좋은 이름을 쓰고싶은 경우 사용
* -> 긴 이름의 클래스를 컬렉션에 사용할 때도 간단히 줄일 수 있음
*
* as import: 다른 패키지의 같은 이름 함수를 동시에 가져오고 싶을 떄 사용
* -> 어떤 클래스나 함수를 임포트할 때 이름을 바꾸는 기능
*
* 구조분해 : 복합적인 값을 분해하여 여러 변수를 한번에 초기화 하는것
*
* Jump와 Label
* return: 기본적으로 가장 가까운 enclosing function 또는 익명함수로 값이 반환된다
* break : 가장 가까운 루프가 제거된다
* continue : 가장 가까운 루프를 다음 step으로 보낸다
*
* label: 특정 expression에 라벨이름@ 을 붙여 하나의 라벨로 간주하고 break, continue, return 등을 사용하는 기능
* 라벨을 이용한 jump는 사용하지 않는것을 추천
*
* TakeIf 와 TakeUnless
*
* takeIf: 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환된다.
* takeUnless: 주어진 조건을 만족하지 않으면 그값이, 그렇지 않으면 null이 반환된다.
* */


//data class는 componentN이란 함수도 자동으로 만들어준다
data class Person(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }
}

fun main() {

    val person = Person("최태현", 100)

    val(name, age) = person

    //아래 두문장을 합친 코드 = 구조분해 문법 -> componentN 함수를 쓴다는것
    //순서를 잘 써야함 (age, name) -> 이름, 나이가 나오기에 잘
//    val (name, age) = person

    //component1은 첫번째 필드를 가져옴
//    val name = person.component1()
    //component2는 두번째 필드를 가져옴
//    val age = person.component2()

    println("이름: ${name}, 나이: ${age}")

    //foreach문은 break, continue문 사용 불가
    //만약 사용하고싶다면, run이라는 블록으로 감싸기 -> 그냥 for문 사용하여 break, continue사용 추천

    val numbers = listOf(1,2,3)
    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    run {
        numbers.forEach { number ->
            if (number == 2) {
                break@run
            }
        }
    }


    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
                //첫번째 @abc에 있는 for문이 중지됨 -> 가까운거 중지되는거 아님
            }
            println("${i} ${j}")
        }
    }
}



