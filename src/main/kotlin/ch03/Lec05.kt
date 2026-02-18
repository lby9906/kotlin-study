package ch03

fun validateScoreInNotNegative(score: Int) {
    if (score > 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}


fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
         "P"
    }else {
         "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
         "A"
    }else if(score >= 80) {
         "B"
    }else if(score >= 70) {
         "C"
    }else {
         "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when(score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A") //만약 obj가 String 타입이라면 obj.startsWith("A") 씀
        else -> false //obj가 String 타입이 아니라면 false 반환
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1,0,-1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1,0,-1이 아닙니다")
    }
}

/*
* java early return 처럼 동작
* when 값 없이 early return 처럼 활용 가능
* */
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수입니다.")
    }
}

/*
* java의 if-else -> Statement
* kotlin은 Expression
* 따라서, kotlin은 if-else를 expression으로 사용할 수 있기 때문에 3항 연산자 없음
*
* Statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다
* Expression: 반드시 하나의 값으로 도출되는 문장
*
* ex) 30+40 = 70 -> Statement + Expression
*
* return if(scroe >= 50) {
* */

/*
* switch 와 when
* 코틀린은 switch 대신 when
* 분기도 들어갈 수 있음 -> in 90..99
* */