```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.each { element ->
      println element.toUpperCase()
    }
  }
}

myMethod(null) // this will now execute without error

myMethod(['apple', 'banana']) //this will print APPLE and BANANA
```