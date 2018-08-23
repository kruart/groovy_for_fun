package groovy.core.fundamental

println 2 + 5 //== 2.plus(5)
def a = 8
println(a++) //8
println(++a) //== a.next()

//it's standard ways to add items like in Java
List<User> users = new ArrayList<>()
users.add(new User(name: "Art", years: 27))
users.add(new User(name: "Ann", years: 21))
users.add(new User(name: "Peter", years: 33))

User user1 = new User(name: "Emre", years: 19)
User user2 = new User(name: "Paulo", years: 35)
User user3 = new User(name: "Samuel", years: 30)

//or add items in that way
users << user1 << user2 << user3    //<< equals to add() method
println(users*.years)   //[27, 21, 33, 19, 35, 30]
println(users*.name)    //[Art, Ann, Peter, Emre, Paulo, Samuel]
users*.setName("Art")   //set to all items "Art" name
println(users*.name)    //[Art, Art, Art, Art, Art, Art]

//overloading operators
def shiftingString = new ShiftingStrings()
shiftingString << "Hello"
shiftingString << " Alex"
println(shiftingString.getStuff())  //Hello Alex

//The Safe Navigation operator is used to avoid a NullPointerException.
ShiftingStrings shiftingStr
/* In java we would be do that:
 * if(shiftingStr != null) { shiftingStr.getStuff()} */
shiftingString?.getStuff()

//Ternary operator
def day = "Monday"
println day == "Monday" ? day : "not Monday"

//if we need to check if something is not null
//then we can use 'elvis' operator
println day != null ? day: "not Monday" //it's version like in java
println day ?: "not Monday" //it's one with elves operator

//Method pointer operator
//The method pointer operator (.&) call be used to store a reference to a method in a variable, in order to call it later:
def str = 'example of method reference'
def fun = str.&toUpperCase
println fun() //EXAMPLE OF METHOD REFERENCE

//Spreading method arguments
//There may be situations when the arguments of a method call can be found in a list that you need to adapt to the method arguments.
//In such situations, you can use the spread operator to call the method.
//For example, imagine you have the following method signature:
int function(int x, int y, int z) {
    x*y+z
}
//then if you have the following list:
def args = [4,5,6]
//you can call the method without having to define intermediate variables:
println(function(*args)) //26
//It is even possible to mix normal arguments with spread ones:
args = [4]
println(function(*args,5,6)) //26

//Spread list elements
//When used inside a list literal, the spread operator acts as if the spread element contents were inlined into the list:
def items = [4,5]
def list = [1,2,3,*items,6]
println list == [1,2,3,4,5,6] //true

//Spread map elements
//The spread map operator works in a similar manner as the spread list operator, but for maps.
// It allows you to inline the contents of a map into another map literal, like in the following example:
def m1 = [c:3, d:4]
def map = [a:1, b:2, *:m1]
println map == [a:1, b:2, c:3, d:4]

//Spaceship operator
//The spaceship operator (<=>) delegates to the compareTo method:
assert (1 <=> 1) == 0
assert (1 <=> 2) == -1
assert (2 <=> 1) == 1
assert ('a' <=> 'z') == -1