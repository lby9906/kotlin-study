package ch06

/*
* scope function
* scope: 영역
* function: 함수
* scope function -> 일시적인 영역을 형성하는 함수
*
* scope function 함수 종류
* 확장함수 특징: 마치 멤버함수를 쓰는것처럼 사용하는 것이 특징
* let: 람다의 결과, it 사용
* run: 람다의 결과, this 사용
* also: 객체 그 자체, it 사용
* apply: 객체 그 자체, this 사용
* with(파라미터, 람다) : 확장함수 아님, this를 사용해 접근하고, this는 생략 가능하다
*
* it: 생략이 불가능한 대신, 다른 이름을 붙일 수 있다.
* this: 생략이 가능한 대신, 다른 이름을 붙일 수 없다.
*
*
* let: 일반 함수를 받는다 -> 파라미터 이름 변경 가능
* run: 확장함수를 받는다 -> 확장함수는 본인 자신을 this로 호출하고, 생략할 수 있었다.
*
*
* let은 하나 이상의 함수를 call chain 결과로 호출할 때 사용 | non-null인 값에 대해서만 code block을 실행시킬 때 | 일회성으로 제한된 영역에 지역 변수를 만들 때
* run은 객체 초기화와 반환 값의 계산을 동시에 해야 할 때 사용 | 객체를 만들어 db에 바로 저장하고, 그 인스턴스를 활용할 때
* apply 특징 : 객체 그 자체가 반환된다. => 객체 설정을 할 때에 객체를 수정하는 로직이 call chain 중간에 필요할 때
* also 특징 : 객체 그자체가 반환된다 -> 객체를 수정하는 로직이 call chain 중간에 필요할 때
* with : 특정 객체를 다른 객체로 변환해야 하는데, 모듈 간의 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 떄 사용 => this를 생략할 수 있어 필드가 많아도 코드가 간결해진다
* */

fun main() {

}

fun printPerson(person: Person?) {
    //아래 if(person != null) 이부분을 let으로 간편하게 만듦
    //let을 통해 람다가 만들어지며 일시적인 영역이 생김

    //safe call(?.)을 사용 : person이 null이 아닐때에 let을 호출
    //let 확장함수: scope function의 한 종류
    //-> 람다를 받아, 람다 결과를 반환한다.
    //람다 안에서 it를 통해 person에 접근

    //즉, 람다를 사용해 일시적인영역을 만들고 코드를 간결하게 만들거나,
    //method chaning에 활용하는 함수를 scope function이라고 함
    person?.let {
        println(it.name)
        println(it.age)
    }
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}
