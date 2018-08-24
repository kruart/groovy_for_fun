package groovy.advanced.trait

/**Created by kruart on 21.07.2017.*/
trait Extra {
    String extra() {"I'm an extra method"}
}

class Something {
    String doSomething() { 'Something' }
}

def s = new Something() as Extra
assert s.extra() == "I'm an extra method"

//Implement multiple traits at runtime
trait T1 {
    String t1method() {"t1 method"}
}
trait T2 {
    String t2method() {"t2 method"}
}
class MyClass {}

def myClass = new MyClass()
def myClassWithTraits = myClass.withTraits(T1, T2)
assert myClassWithTraits.t1method() == "t1 method"
assert myClassWithTraits.t2method() == "t2 method"