package groovy.advanced.trait

/**Created by kruart on 21.07.2017.*/
trait A {
    String exec() {'A'}
}

trait B {
    String exec() {'B'}
}

class C implements A, B {}

def c = new C()
assert c.exec() == 'B' //a little disappointing

class D implements A, B {
    String exec() {
        A.super.exec()
    }
}
def d = new D()
assert d.exec() == 'A'