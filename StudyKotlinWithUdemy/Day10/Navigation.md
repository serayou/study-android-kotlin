## 강의 요약 (강의 제공)

https://tutorials.eu/mastering-screen-navigation-with-kotlin-day-10-android-14-masterclass/

## Navigation

## sealed class

자신을 상속받는 여러 서브클래스를 생성 가능

일반 클래스와 달리, 상속을 통해 확장할 수 있는 클래스의 범위를 제한하여 타입 안정성을 보장

서브클래스는 같은 파일 내에 선언되어야 함

상태값이 바뀌지 않는 서브 클래스의 경우 object 를 사용하는 것을 권장

```
장점

컴파일 단계에서 서브클래스를 확인하게 때문에 런타임에서 예상하지 못한 동작을 방지
클래스 계층의 구조를 명확히 할 수 있음
가독성 향상
```

## Pacelize

객체를 Parcel로 직렬화(serialize)하고, Parcel에서 객체로 역직렬화(deserialize)하는 과정을 쉽게 만들어주는 어노테이션

직렬화(serialize) : 객체를 전송 가능한 형태로 만들어줌. 데이터를 연속적인 데이터로 변형해서 데이터를 읽을 수 있도록 변형.

역직렬화(deserialize) : 직렬화된 데이터를 다시 객체 형태로 만들어줌.

## First-class citizen

```
변수에 담을 수 있다.

함수의 인자로 전달할 수 있다.

함수의 반환값으로 전달할 수 있다.
```

위의 조건을 충족하는 것

```
코틀린의 함수는 1급(first-class) 

자바 : 함수는 클래스의 멤버의 역할을 수행
코틀린 : 함수 자체가 하나의 변수가 될 수 있고 고차 함수의 인자로 전달되고 반환될 수 있음
```

## 고차 함수 (Higher-Order Functions)

고차 함수는 함수를 매개변수로 받을 수 있고, 함수를 반환할 수 있는 함수

## Lambda Expression

## 후행 람다(Trailing Lambda)

함수의 마지막 매개변수가 함수라면, 매개변수로 보내지는 함수는 소괄호 뒤에 위치할 수 있음

```Kotlin
max(str, {a,b -> a.length < b.length})
```
매개변수와 람다식을 구분

```Kotlin
max(str) {a,b -> a.length < b.length}
```
