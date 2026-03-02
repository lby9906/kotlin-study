package ch05

/*
* 코틀린에서 람다를 다루는 방법
* 코틀린에서는 함수가 그자체로 값이 될수있음 -> 변수 할당 및 파라미터로 넘길수도 있음
*
* Closure
* 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있는 데이터 구조
*
* try with resources
* */

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    //람다함수 : 이름없는 함수
    //람다를 만드는 방법1
    val isApple = fun(fruit: Fruit): Boolean {
        return result.name == "사과"
    }

    //함수의 타입 (파라미터 타입...) -> 함수타입
    val isApple3: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return result.name == "사과"
    }

    //람다를 만드는 방법2
    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    filterFruits(fruits) { it.name == "사과" } //람다의 파라미터를 it를 통해 명시


    //함수의 타입 (파라미터 타입...) -> 함수타입
    val isApple4: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"}

    //람다를 직접 호출하는 방법1
    isApple(fruits[0])

    //람다를 직접 호출하는 방법2
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}