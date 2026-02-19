package ch04

/*
* 위 클래스명 () 괄호 안에 생성자 위치 -> constructor
* final은 불변이기에 수정이 불가능한 val로 선언
* var은 수정가능한 필드이기에 age는 var로 선언
* 생성자에 타입이 나와있어 굳이 밑에 var, val 부분에 타입 선언 안해줘도됨
*
* 프로퍼티 = 필드 + getter + setter
* 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어줌
*
* constructor 지시어는 생략 가능
* 필드를 2개 선언하지 말고 생성자에 타입들 넣어도 됨
* 즉, 클래스의 필드 선언(프로퍼티 선언)과 생성자를 동사에 합칠 수 있어 간결하게 선언 가능
*
* 2. 생성자와 init
* init : 클래스가 초기화되는 시점에 한번 호출되는 블록(생성자가 호출되는 시점에 호출되는 블록) => 보통 검증 로직 구현할 때 사용
* 주 생성자가 반드시 존재해야함 -> 클래스 명 () 있을때
* 주 생성자에 파라미터가 한개도 없는 경우 기본적으로 만들어줘서 생성자 선언 해주지 않아도 됨
*
* 아래 추가적으로 constructor 부 생성자는 있어도 없어도됨 -> 최종적으로 주 생성자를 선언해야함
* 부 생성자는 블록을 선언할 수 있음
* 부 생성자는 계속해서 선언 가능
*
* 부 생성자보단 default parameter를 추천 -> 생성자에 기본값을 넣어 파라미터에 값이 없다면 기본 생성자로 먹히게
* 부 생성자보단 정적 팩토리 메서드 사용
*
* 3. 커스텀 getter, setter
* 주 생성자에서 받은 name을 불변 프로퍼티 name에 바로 대입
* name에 대한 커스텀 getter를 만들때 field를 붙여야함
* field : 무한루프를 막기 위한 예약어, 자기 자신을 가리킨다
* */


fun main() {
    val person = Person("최태현", 100)
//    val person = JavaPerson("최태현", 100)
//    println(person.name) //getter
    person.age = 10 //setter
    println(person.age)

    Person()
}
class Person(
    name: String = "최태현",
    var age: Int = 1) {

    val getName = name
        get() = field.uppercase()

    var setName = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    } //생성자 추가 시 consturctor(파라미터)로 생성자 추가 / this가 또 다른 생성자를 가르켜서 위 생성자를 가리킴
    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }

    //함수 방식
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    //함수 대신 프로퍼티처럼 만들 수 있음
    val isAdult: Boolean
        get() = this.age >= 20 //expression으로 표현할 수 있음
}