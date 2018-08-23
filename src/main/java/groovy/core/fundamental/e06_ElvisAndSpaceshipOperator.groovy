package groovy.core.fundamental

class Department {
    Manager boss
}

class Manager {
    String name
}

def d = new Department(boss: new Manager(name: 'Mr Burns'))
println(d.boss.name)

d = new Department()
//use elvis operator to avoid NullPointerException
println d?.boss?.name //null

//elvis operator more examples
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

//spaceship operator
int x = 3
int y = 6
int z = 8
println x <=> y
println y <=> y
println z <=> y

assert (1 <=> 1) == 0
assert (1 <=> 2) == -1
assert (2 <=> 1) == 1
assert ('a' <=> 'z') == -1