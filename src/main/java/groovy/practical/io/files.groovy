package groovy.practical.io

/**Created by kruart on 24.08.2018.*/
//*************************************
def files = []
//'.' - all files inside this folder
new File('.').eachFileRecurse { file ->
    if (file.name.endsWith('.groovy')) {
        files << file
    }
}
assert files
println "There are ${files.size()} groovy files"
println files
//=====================================
//*************************************
String data = new File('files.groovy').text
assert data.contains('text')    //this file contains 'text' word
//=====================================
//*************************************
List<String> lines = new File('files.groovy').readLines()*.trim()
assert lines[0] == 'package groovy.practical.io' //first line in this file is 'groovy.practical.io'

lines.reverse().each { println it }
//=====================================
//**********************
List dataLines = []
new File('data.txt').splitEachLine(',') {   //each line is the array
    dataLines << it
}
assert dataLines == [['1','2','3'],['a','b','c']]
//=====================================
//**********************
File f = new File("output.dat") //create file
f.write('Hello, Groovy!')

assert f.text == 'Hello, Groovy!'
f.delete()  //and then delete it
//======================
//**********************
File temp = new File('temp.txt')

// Don't really need parens here, so why use them?
temp.write 'Groovy Kind of Love'
assert temp.readLines().size() == 1

// Need to start with a carriage return
temp.append "\nGroovin', on a Sunday afternoon..."

// Note use of overloaded << operator
temp << "\nFeelin' Groovy"
assert temp.readLines().size() == 3
temp.delete()
//======================