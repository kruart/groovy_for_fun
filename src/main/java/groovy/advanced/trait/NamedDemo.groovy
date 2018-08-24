package groovy.advanced.trait

/**Created by kruart on 21.07.2017.*/
trait Named {
    String name
}

class NamedPerson implements Named {}

def p = new NamedPerson(name: "Bob")
assert p.name == 'Bob'
assert p.getName() == 'Bob'