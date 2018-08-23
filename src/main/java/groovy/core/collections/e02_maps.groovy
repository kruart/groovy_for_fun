package groovy.core.collections

def mapItems = [a: 1, "b": 2, 'c': 2]
println mapItems.a  //1
println mapItems.getClass()  //class java.util.LinkedHashMap

//adding items to map
mapItems.put("d", 3)
mapItems['e'] = 3
mapItems << ["f": 4]
println mapItems //[a:1, b:2, c:2, d:3, e:3, f:4]


def myMap = [1: "Art", 2: "James", 3: "David", 4: "Michael"]
println myMap.size() //4
println myMap[2]    //James
myMap << [5: "Dianne"]
println myMap.getClass() //class java.util.LinkedHashMap
println myMap.keySet()   //[1, 2, 3, 4, 5]
println myMap.values()   //[Art, James, David, Michael, Dianne]

def myMap1 = ["one": "Art", "two": "James", "three": "David", "four": "Michael"]
println myMap1.one //Art... it doesn't work with numbers
myMap1.each() {
    println("${it.getKey()} ${it.getValue()}")
}
myMap1.each {key, value -> println "$key $value"}

//find items in a Map
println myMap1.findAll {key ,value -> value[0]=='M'} //[four: Michael]
myMap1.findAll {k ,v -> v[0]=='M'}.each {k, v -> println v} //Michael
println myMap1.collect {k, v -> v.toUpperCase()}//[ART, JAMES, DAVID, MICHAEL]
println myMap1.collectEntries({key, value -> [key, value.toUpperCase()]})