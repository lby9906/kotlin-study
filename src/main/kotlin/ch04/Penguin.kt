package ch04

/*
* 추상 클래스
* 추상 프로퍼티가 아니라면, 상속받을 때 open을 꼭 붙여야함
* 자바, 코틀린 모두 추상클래스는 인스턴스화 할 수 없다
*
* 인터페이스
* 인터페이스 구현도 : 사용 / ,로 구분
* 중복되는 인터페이스를 특정할 때 super<타입>.함수 사용
* 자바, 코틀린 모두 인터페이스는 인스턴스화 할 수 없다
* */

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꽤꽥")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount


    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = super.swimAbility
}