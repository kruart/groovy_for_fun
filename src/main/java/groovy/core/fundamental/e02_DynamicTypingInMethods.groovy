package groovy.core.fundamental

//def modifier is not required in params. def someValue= someValue
def getLastLetter(someValue) {
    return someValue.substring(someValue.length() - 1)
}
println(getLastLetter("Hello"))

//length - if not specified then 1 by default
def getLastLetters(someValue, length = 1) {
    someValue.substring(someValue.length() - length)
}
println(getLastLetters("Hello", 3)) //llo
println(getLastLetters("Hello"))    //o

//replace spaces on underscore
def replaceSpaces(str) {
    str.replace(" ", "_")
}
println(replaceSpaces("hello groovy"))   //hello_groovy

//return several values
def analyseVowels(myString) {
    def a = 0
    def e = 0
    def i = 0
    def o = 0
    def u = 0

    for (int counter = 0; counter < myString.length(); counter++) {
        if (myString.charAt(counter) == 'a') {a++}
        if (myString.charAt(counter) == 'e') {e++}
        if (myString.charAt(counter) == 'i') {i++}
        if (myString.charAt(counter) == 'o') {o++}
        if (myString.charAt(counter) == 'u') {u++}
    }
    return [a, e, i, o, u] //return class java.util.ArrayList
}
arr = analyseVowels("The quick brown fox jumped over the lazy dog.")
println(arr)            //[1, 4, 1, 4, 2]
println(arr.getClass()) //class java.util.ArrayList

//save elements in separate variables only in one go
def (a, e) = analyseVowels("The quick brown fox jumped over the lazy dog.")
println(a)  //1
println(e)  //4