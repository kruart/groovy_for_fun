package groovy.advanced.functional.e02

//Closures with one parameters
def closureWithOneArg = { str -> str.toUpperCase() }
println closureWithOneArg('groovy') //'GROOVY'

def closureWithOneArgAndExplicitType = { String str -> str.toUpperCase() }
println closureWithOneArgAndExplicitType('groovy') // 'GROOVY'

def closureWithTwoArgs = { a,b -> a+b }
println closureWithTwoArgs(1,2) // 3

def closureWithTwoArgsAndExplicitTypes = { int a, int b -> a+b }
println closureWithTwoArgsAndExplicitTypes(1,2) // 3

def closureWithTwoArgsAndOptionalTypes = { a, int b -> a+b }
println closureWithTwoArgsAndOptionalTypes(1,2) // 3

def closureWithTwoArgAndDefaultValue = { int a, int b=2 -> a+b }
println closureWithTwoArgAndDefaultValue(1) // 3

//Implicit parameter
def greeting = { "Hello, $it!" }
println greeting('Patrick') // 'Hello, Patrick!'
//is stricly equivalent to this one:
def greeting1 = { it -> "Hello, $it!" }
println greeting1('Patrick') // 'Hello, Patrick!'

//Varargs: http://docs.groovy-lang.org/next/html/documentation/#_varargs_2
def concat1 = {String... args -> args.join("")}
println concat1("He", "llo") //Hello
def concat2 = { String[] args -> args.join('_') }
println concat2('Juve', 'is', 'champ') // 'Juve_is_champ'

def multiConcat = { int n, String... args ->
    args.join('')*n
}
println multiConcat(2, 'he','llo') // 'hellohello'

//Composition: http://docs.groovy-lang.org/next/html/documentation/#_composition
def plus2  = { it + 2 }
def times3 = { it * 3 }

def times3plus2 = plus2 << times3   //two methods in one call
println times3plus2(3)              //execute
