package ch02

fun main() {
//    val money1 = JavaMoney(2_000L)
//    val money2 = JavaMoney(1_000L)
//
//    if (money1 > money2) {
//        println("Money1이 Money2보다 금액이 큽니다")
//    }

    if (fun1() || fun2()) {
        println("본문")
    }
}

fun money() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 == money3) // 값을 비교하는것이라서 true
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}

fun main2() {
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1 + money2) //가능
}

/*
* 단항연산자
* ++ , --
*
* 산술연산자
* + - * / %
*
* 산술대입 연산자
* += -= *= /= %=
*
* 비교 연산자
* 단, 코틀린은 객체를 비교할 떄 비교연산자를 사용하면 자동으로 compareTo를 호출해줌
* > < >= <=
* */


/*
* 비교연산자 동등성 , 동일성
* 동등성: 두 객체의 값이 같은가 -> == (간접적 equals 호충)
* 동일성 : 완전히 주소 값이 같은가 -> ===
* */

/*
* 논리연산자
* ** || !
* */

/*
* in / !in
* 컬렉션 범위에 포함 / 미포함
*
* a..b
* a ~ b까지 범위 객체 생성
*
* a[i]
* a에서 특정 Index i로 값을 가져온다
*
* a[i]=b
* a의 특정 index i에 b를 넣는다
*  */


/*
* 연산자 오버로딩
* 코틀린에서 객체마다 연산자 직접 정의할 수 있음
* */

