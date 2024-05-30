## 강의 요약 (강의 제공)

## Navigation

## sealed class

## First-Class Functions

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
