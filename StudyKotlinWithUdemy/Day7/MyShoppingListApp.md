## 강의 요약 (강의 제공)

https://tutorials.eu/exploring-more-advanced-ui-components-day-7-android-14-masterclass/

## let

```kotlin
val editedItem = sItems.find { it.id == item.id }
editedItem?.let {
  it.name = editedName
  it.quantity = editedQuantity
}
```

