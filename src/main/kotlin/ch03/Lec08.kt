package ch03

/*
* 코틀린 함수를 다루는 방법
*
* 함수 선언 문법
* default parameter
* named argument(parameter)
* 같은 타입의 여러 파라미터 받기(가변인자)
* */

fun main() {
    repeat("Hello World")
    repeat("Hello World", useNewLine = false) // 이름이 있는 파라미터

    printNameAndGender(name = "최태현", "FAMALE") //코틀린에서 자바 함수를 가져다 사용할 경우 named argument 사용할 수 없음

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array) //* : spread 연산자, 배열 안에 있는 것들을 마치 그냥 ,를 쓰는 것 처럼 꺼내준다
}

//두정수를 받아 더 큰 정수를 반환하는 예제
/*
* 접근 지시어, public은 생략 가능
* 함수의 반환타입 -> Unit 생략 가능
* 함수가 하나의 결과값이라면 block 대신 = 사용 가능
* 한줄로 변경 가능
* 둘다 int타입을 반환하기에 반환 타입 생략 가능(= 을 사용하는 경우만)
* block{} 을 사용하는 경우는 반환타입이 Unit이 아니라면 명시적으로 작성 해야함
* */
fun max(a: Int, b:Int) = if (a > b) a else b


//주어진 문자열을 n번 출력하는 예제
/*
* default parameter
* 밖에서 파라미터를 넣어주지 않으면 기본값을 사용하자
* */
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        }else {
            print(str)
        }
    }
}

//named argument
//매개변수 이름을 통해 직접 지정
//지정되지 않은 매개변수는 기본값 사용
//builder를 직접 만들지 않고 builer 장점 만듦

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

//같은 타입의 여러 파라미터 받기
/*
* 문자열을 n개 받아 출력하는 예제
* 제일 앞에 varage
* 배열 바로 넣는 대신 스프레드 연산자 *를 붙여줘야 함
* */

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}