package ch04

/*
* 상속 시 extends 키워드가 아닌 : 을 사용
* 타입 선언은 변수명: 이렇게 붙이고, 상속 선언은 ) : 클래스명 이렇게 띄워주는 걸로 구분
* 상속 시 상위 클래스의 생성자를 바로 호출
* override를 필수적으로 붙여줘야함
* */

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}