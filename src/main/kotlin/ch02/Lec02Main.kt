package ch02

fun main() {
    val str: String? = "ABC"
//    println(str.length)
    println(str?.length) // null이 아니면 뒤에 length를 실행시키고, null이면 저 length부분까지 전체가 다 null

    println(str?.length ?: 0) // str이 null이면 결과가 0 / null이 아니라면 결과가 3

    println(startWith("ABC"))
}

// ? :null이 들어올 수 있음을 명시
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")


//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다")
//    }
//    return str.startsWith("A")
}


//Boolean? : null이 들어올 수 있음 -> java에서는 Boolean
//Boolean : null이 들어올 수 없음 -> java에서는 boolean
fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
    //str이 null이면 전체가 null


//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}


fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}


//!! : 이 변수는 절대 null이 아니라고 선언
fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}


fun person() {
    val person = Person("공부하는 개발자")
    startWithA(person.name) //자바에서 코틀린 코드를 가져다 쓸 경우 -> @Nullable / @NotNUll 어노테이션을 통해 알려줌
}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}

/*
* safe call
* null이 아니면 실행하고, null이면 실행하지 않음(그대로 null)
*
* 즉,
*
* val str: String? = "ABC"
* str.length // 불가능
* str?.length //가능
*
* 이유는, 코틀린에서는 String? 타입이 null이 허용인데, str.length만 했을때 null이 들어오면 어떻게 할지 몰라 컴파일 에러가 남
* */

/*
* Elvis 연산자
* 앞의 연산 결과가 null이면 뒤의 값을 사용
*
* 즉,
* val str: String? = "ABC"
* str?.length ?: 0
*
* str이 Null이면 앞이 null이 됨
*
* early return에도 사용 가능 -> if문을 굳이 사용 x
* */

/*
* nullable type이지만, 아무리 생각해도 null이 될 수 없는 경우
* !! : 해당 변수는 절대 Null이 아님을 선언
* 혹시나 null이 들어오면 npe
* */


/*
* 플랫폼 타입
* 자바 -> 코틀린 코드를 가져다 쓸 경우
* @Nullable
* @NotNull 활용
*
* 코틀린이 null 관련 정보를 알 수 없는 타입 Runtime 시 Exception이 날 수 있음
* */