package groovy.core.fundamental

//Three ways to create strings in groovy
def greeting1 = "Hello, Groovy!"
def greeting2 = 'Hello, Java!'  //single quotes doesn't evaluate expression inside string
def greeting3 = /Hello, Scala/  //it's way useful when doing regEX

//If use want to use $ symbol, use it whether in single quotes or \$
println('I charge $4 dollars per hour')
println("I charge \$4 dollars per hour")

//concatenate strings. Just use ${varName}
def fTeam1 = "Juve won"
println("${fTeam1} 5:0")

//expressions inside string
def clbs = "MilanJuventusRome"
def index = clbs.indexOf("Juventus") //get index
def strEx1 = "Hello, ${clbs.substring(index, index + 8)}"
println(strEx1) //Hello, Juventus

def a = 100
println("Result:  ${a / 5}")    //Result: 20

def strEx2 = "Random num: ${Math.random() * a}"
def strEx3 = 'Random num: ${Math.random() * a}'
println(strEx2) //Random num: 67.17810439350484
println(strEx3) //Random num: ${Math.random() * a}

def strCl1 = "Ola ... ${25 * 5}"
String strCl2 = "Ola ... ${25 * 5}"
println strCl1.getClass() //class org.codehaus.groovy.runtime.GStringImpl
println strCl2.getClass() //class java.lang.String
println strCl2.equals(strCl1) //false, different types
println strCl2 == (strCl1) //true, it's right way to compare string in groovy
println strCl2.is(strCl1) //false, it's like == in Java, compare references

//Slashy strings
def zip1 = /\d{5}(-\d{4})?/     //String class
def zip2 = ~/\d{5}(-\d{4})?/    //~ switch to the java.util.regex.Pattern

//multiple strings in groovy
def multipleStr = """Ola, Ola, Ola
Hello, my friend!

PS: Bye Bye"""
println(multipleStr)
println(multipleStr.getClass()) //class java.lang.String

//StringBuilder
StringBuilder builder = new StringBuilder()
builder << "Start" //it's like append()
builder << " the great " << "race "
builder.append("GO, GO, GO")//And yes we can use append() method also
println(builder)    //Start the great race GO, GO, GO

def myStr = "Hello Milan"
def removeStr = myStr -= "Milan"    //Delete 'Milan' from string
removeStr += "Juventus"
println(removeStr)

//we can use string like an array of chars
def strArr = "I learn Groovy Programming Language"
println(strArr[0])  //I - first letter
println(strArr[-1])  //e - last letter
println(strArr[8..13])  //Groovy
println(strArr[-8..-1])  //Language
println strArr[-1..-8]  //egaugnaL - Language reverse
println strArr[0, 2..6, 8..13, 15..25, 27..34] //IlearnGroovyProgrammingLanguage