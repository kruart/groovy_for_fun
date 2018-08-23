package groovy.core.collections

import groovy.core.fundamental.User

//some examples
List nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]
println nums.getClass().getName() //java.util.ArrayList
println nums.drop(3) //[1, 5, 9, 2, 6, 5]

def arr = [1,[2,3],[[4]],[],5].flatten()
println arr.flatten() //[1, 2, 3, 4, 5]
println nums[-1..-3] //[5, 6, 2]
println nums * 2 //[3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 1, 4, 1, 5, 9, 2, 6, 5]
println nums + [3, 5] //[3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
println nums << [3, 5] //[3, 1, 4, 1, 5, 9, 2, 6, 5, [3, 5]]

//it's standard ways to add items like in Java
List<User> users = new ArrayList<>()
users.add(new User(name: "Art", years: 26))
users.add(new User(name: "Ann", years: 21))
users.add(new User(name: "Peter", years: 33))

User user1 = new User(name: "Art", years: 26)
User user2 = new User(name: "Ann", years: 21)
User user3 = new User(name: "Peter", years: 33)
//users.add(user1)
//users.add(user2)
//users.add(user3)

//or add items in that way
users << user1 << user2 << user3  //<< overloading leftShift() method
//users.leftShift(user1).leftShift(user2).leftShift(user3) //the same

//some others call operators for work with collections
println users*.years //[26, 21, 33, 26, 21, 33]
println users*.name //[Art, Ann, Peter, Art, Ann, Peter]
users*.setName("Art") //set to all items "Art" name
println users*.name //[Art, Art, Art, Art, Art, Art, Art, Art, Art]

user1 = new User(name: "Art", years: 26)
user2 = new User(name: "Ann", years: 21)
user3 = new User(name: "Peter", years: 33)
//other way to add items to list
def groovyUsers = [user1, user2, user3] //create list and add users inside it
println(groovyUsers.getClass()) //class java.util.ArrayList

println "The first item is ${groovyUsers[0].getName()}" //Art
println "The last item is ${groovyUsers[-1].name}" //Peter
groovyUsers.each {print("$it.name ")} //Art Ann Peter
println()
groovyUsers.reverseEach {print("$it.name ")} //Peter Ann Art
println()

//search in array
def findUser = groovyUsers.find({it.getName()[0] == "A"})
println findUser*.name   //[Art]
def findUsers = groovyUsers.findAll({it.getName()[0] == "A"})
println findUsers*.name //[Art, Ann]

groovyUsers.eachWithIndex({ item, index -> println "The item ${item.name} index: $index"})

def userNames = groovyUsers*.name //get names
println userNames.collect({it.toUpperCase()}) //[ART, ANN, PETER]

//create new collection
def nums1 = [1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7]
println nums1.unique() //[1, 2, 3, 4, 5, 6, 7]
println nums1.sum() //28
println nums1.sum({it * it}) //140
println nums1.inject {previousResult, currentValue -> previousResult * currentValue} //5040

