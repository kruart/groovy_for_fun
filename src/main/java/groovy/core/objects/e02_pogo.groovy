package groovy.core.objects;

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

//Pogo is plain old groovy object like pojo in java
@ToString(includePackage = false)   //create toString impl
@EqualsAndHashCode
@TupleConstructor
//short way to add ToSting, @EqualsAndHashCode, @TupleConstructor
//@Canonical
class Person {
    String first
    String last
}

Person p = new Person(first: "A", last: "K")
Person p1 = new Person()
p1.setFirst("A")
p1.setLast("K")
println p
println "${p1.getFirst()} ${p1.last}"

println p == p1 //== call equals method

Set people = [p, p1]
println people.size() //1 (no duplicates)


