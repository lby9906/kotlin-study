package ch05

/*
* 코틀린에서 컬렉션을 함수형으로 다루는 방법
*
* all: 조건을 모두 만족하면 true, 그렇지 않으면 false
* none: 주어진 조건을 모두 불만족하면 true, 그렇지 않으면 false
* any: 조건을 하나라도 만족하면 true, 그렇지 않으면 false
* count: 개수를 센다
* sortedBy: 오름차순 정렬을 한다
* sortedByDescending: 내림차순 정렬을 한다
* distinctBy: 변형된 값을 기준으로 중복을 제거한다
* first: 첫번째 값을 가져온다(무조건 null이 아니어야함)
* firstOrNull: 첫번째 값 또는 null을 가져온다
* last: 마지막값을 가져온다(무조건 null이 아니어야함)
* lastOrNull: 마지막 값 또는 null을 가져온다
* groupBy: 이름을 기준으로 그룹핑
* associateBy: value쪽에 리스트가 아니라 단일객체가 들어옴(중복되지 않은 키를 가지고 맵을 만들때 사용)
* flatMap: list list가 단일list로 바뀜
* flatteb: 중첩되는 컬렉션이 모두 평탄화되는것
* */

fun main() {

}


private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}