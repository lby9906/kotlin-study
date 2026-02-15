package ch02

/*
* 기본 타입
* Int
* Long
* Float
* Double
*
* 코틀린은 타입이 명시적으로 선언되어야함
* 암시적인 타입 변경이 불가능 -> 명시적으로 to변환타입()을 사용해야함
* */


/*
* 일반 타입 -> 타입 캐스팅
*
* */

fun main() {
    val num1 = 3
    val num2: Long = num1.toLong()

    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
}

//is: java -> instanceOf
// 코틀린 -> is
// obj가 Person타입이라면
// obj가 Person이면 true / 아니라면 false
// as Person() -> obj라는 변수를 Person타입으로 간주한다(생략 가능)
// instanceof의 반대: !is -> obj가 Person이 아니라면 이라는 의미

// obj에 null이 들어올 수 있다면?
//

fun personMain() {
//    printAgeIfPerson(Person("", 100))
    printAgeIfPerson(null)
}

//as? : 만약 obj가 null이 아니라면 Person타입으로 변화 시키고
// null이라면 safe call처럼 전체가 null로 됨
//따라서, as? 는 null이 들어올 수 있기에 null처리를 위해 person 타입은 Person? 이 되어야하고, person?.age가 되어야함
fun printAgeIfPerson(obj: Any?) {
    val person: Person? = obj as? Person
//    println(person?.age)

//    if (obj is Person) {
//        val person = obj as Person
        //println(obj.age) -> 가능(스마트캐스트)
//        println(person.age)
    }

/*
* Any
* 자바의 Object 역할(모든 객체의 최상위 타입)
* 모든 Primitive type의 최상의 타입도 Any -> 자바에서는 아님
* Any자체로 Null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현
* Any에 equals / hashCode / toString 존재
* */

/*
* Unit
* 자바의 void와 동일한 역할
* void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능
* 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미
* 즉, 코틀린의 Unit은 실제 존재하는 타입을 표현
* */

/*
* Noting
* 함수가 정상적으로 끝나지 않았다는 사실 표현 역할
* 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
* */

/*
* String interpolation / String indexing
* ${변수}를 사용하면 값이 들어감
*
* 가독성을 위해 ${변수}를 사용하는 것이 가독성 / 일관 변환 / 정규식 활용 측면에서 좋음
* */

/*
* """ """ -> .trimIndent()
* Indentation이 사라지고 출력해줌
*
*
* 문자열에서 문자를 가져올 때는 java처럼 배열의 []를 사용
* */

fun nameMain() {

    //java
//    val person = Person("최태현",100)
    //System.out.println(String.format("이름: %s", person.name))

    //kotlin
//    println("이름: ${person.name}")
}