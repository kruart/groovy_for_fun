package groovy.core.fundamental

println 100.getClass() //class java.lang.Integer
for (int i = 0; i < 3; i++) {
    println("1 LOOP: position - " + i)
}

for (i in 0..3) {   //3 iclusive
    println("2 LOOP: position - " + i)
}

//iterate through list
List<User> users = new ArrayList<>()
users.add(new User(name: "Art", years: 26))
users.add(new User(name: "Ann", years: 21))
users.add(new User(name: "Peter", years: 33))

//it's groovy foreach variant for (User user : users)
for (User user in users) {
    println("1 ArrayList item $user.name $user.years")
}

users.each() {println("2 ArrayList item $it.name $it.years")}

//while loop
def a = 3
while (a-- > 0) {
    println(a)
}

///******RANGED*******
def firstRange = 5..7   //5, 6, 7
println(firstRange.getClass()) //class groovy.lang.IntRange
firstRange.each() {println("4 LOOP: position - $it")}   //7 inclusive

def secRange = 5..<7 //up to 7: only 5, 6
secRange.each() {println("5 LOOP: position - $it")}

def thirdRange = 5..1 //1 inclusive
thirdRange.each {println("6 LOOP: position - $it")}     // 5, 4, 3, 2, 1
thirdRange.step(2) {println("7 LOOP: position - $it")} //step in 2: 5, 3, 1

3..1.each {println("8 LOOP: position - $it")} //return only 1
(3..1).each {println("9 LOOP: position - $it")} //use brackets, it's right way or use def
