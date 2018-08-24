package groovy.advanced.trait

/**Created by kruart on 21.07.2017.*/
trait Greetable {
    abstract String name()

    String greeting() {"Hello, ${name()}!"}
}

class Person implements Greetable {
    @Override
    String name() {
        return "Art"
    }
}

Person p = new Person()
assert p.greeting() == 'Hello, Art!'