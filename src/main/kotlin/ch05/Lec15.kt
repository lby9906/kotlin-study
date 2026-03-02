package ch05

/*
* 가변(Mutable)컬렉션: 컬렉션에 element를 추가, 삭제 할 수 있다.
* 불변 컬렉션: 컬렉션에 element를 추가, 삭제 할 수 없다.
*
* 컬렉션을 만들자마자 unmodifiableList()등을 붙여준게 불변
* 불변컬렉션이라 하더라도 Reference Type인 Element의 필드를 바꿀 수 있다.
* list.get(0)접근해서 그 안에 필드의 값을 변경 가능 -> 자바와 동일
*
* 코틀린은 컬렉션 리스트를 불변/가변을 지정해주어야함
*
* 우선 불변리스트를 만들고 필요한 경우 가변 리스트로 바꾸자
*
*[집합]
* 집합은 List와 다르게 순서가 없고, 같은 element는 하나만 존재할 수 있음
* 자료구조적 의미만 제외하면 모든 기능이 List와 비슷
*
* 가변 집합을 만들고 싶다면 -> mutableSetOf() -> 기본 구현체는 LinkedHashSet
*
* [컬렉션의 null 가능성, java와 함께 사용하기]
* List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
* List<Int>? : 리스트에 null이 들어갈 수 없지만, 리스트는 null일 수 있음
* List<Int?>? : 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음
*
* ?위치에 따라 null 가능성 의미 달라지므로 주의
*
* 코틀린쪽의 컬렉션이 자바에서 호출되면 컬렉션 내용이 변할수 있음을 감안
* 코틀린쪽에서 Collections.unmodifableXXX()를 활용하면 변경 자체 막을 수 있음
* */

fun main() {
    val array = arrayOf(100, 200)

    //index를 받아와 인덱스를 통해 배열의 값들을 접근
    //array.indices: 0부터 마지막 index까지의 Range
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    //한번에 접근
    //withIndex: 인덱스과 값을 한번에 가져올 수 있다
    for ((idx, value) in array.withIndex()) {
        println("${idx} ${array[idx]}")
    }

    //값을 쉽게 추가할 수 있음
    array.plus(300) //배열 새로운 element 추가


    //Int를 적지않아도 자동 추론 가능
    //불변 리스트: listOf
    val numbers = listOf(100,200)

    //가변 리스트: mutableListOf -> arrayList가 기본 구현체
    val numbers1 = mutableListOf(100,200)
    numbers1.add(300)

    //비어있는 리스트를 만들 경우 타입이 뭔지 명시해줘야함
    val emptyList = emptyList<Int>()

    //매개변수에 타입을 추론할 수 있음(Int)
    printNumbers(emptyList)

    //하나를 가져오기
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    //인덱스와 리스트안에있는 값을 한번에 가져올수있음
    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }


    mutableSetOf(10L)


    //Map의 다양한 값 넣는 방법들
    //타입을 추론할 수 있어 타입 지정
    //가변 map이라 key, value 넣을 수 있음
    // 자바처럼 put 사용하고, map[key] = value 쓸 수 있음
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    //중위 호출
    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    //key와 value를 한꺼번에 가져오는 방법
    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>) {

}