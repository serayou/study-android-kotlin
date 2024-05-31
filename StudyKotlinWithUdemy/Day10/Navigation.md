## 강의 요약 (강의 제공)

https://tutorials.eu/mastering-screen-navigation-with-kotlin-day-10-android-14-masterclass/

## Navigation

## sealed class

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
