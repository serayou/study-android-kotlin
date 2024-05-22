## 강의 요약 (강의 제공)

https://tutorials.eu/mastering-state-management-and-essential-kotlin-syntax-day-6-android-14-masterclass/

## UnitConverter

Day5 폴더 내 프로젝트와 이어짐

## remember

```typescript
val a = remeber{mutableStateOf(0)}
```

a.value를 통해 value에 접근해야 함

```typescript
val a by remember{mutableStateOf(0)}
```

그 자체로 이미 value을 가지고 있기 때문에 바로 value를 보여줌



