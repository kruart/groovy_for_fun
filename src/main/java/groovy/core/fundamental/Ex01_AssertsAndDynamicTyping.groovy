package groovy.core.fundamental

import java.time.LocalDateTime

//asserts
int x = 3
int y = 4
assert 7 == x + y //true

def str1 = "Hello"
def str2 = "Hell"
assert str1 == str2 + "o"

//dynamic typing
def num = 10
println num.getClass().getName()    //java.lang.Integer

num = "hello"
println(num.getClass().getName())   //java.lang.String

num = LocalDateTime.now()
println(num.getClass().getName())   //java.time.LocalDateTime
