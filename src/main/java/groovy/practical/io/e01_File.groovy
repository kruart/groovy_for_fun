package groovy.practical.io

import groovy.io.FileType
import groovy.io.FileVisitResult

//print all lines of a text file
new File("somefile.txt").eachLine {line -> println(line)}
new File("somefile.txt").eachLine {line, lineNumber -> println("Line $lineNumber: $line")}

//in some cases you will prefer to use a Reader
def count = 0, MAXSIZE = 3
new File("somefile.txt").withReader { reader ->
    while (reader.readLine()) {
        if (++count > MAXSIZE) {
            throw new RuntimeException('Somefile should only have 3 verses')
        }
    }
}

//to collect the lines of a text file into a list
def list = new File("somefile.txt").collect() {it}

//Or you can even leverage the as operator to get the contents of the file into an array of lines
def array = new File("somefile.txt") as String[]

//How many times did you have to get the contents of a file into a byte[]
//and how much code does it require? Groovy makes it very easy actually:
byte[] contents = new File("somefile.txt").bytes

//write a file
new File('somefile1.txt').withWriter('utf-8') { writer ->
    writer.writeLine 'Into the ancient pond'
    writer.writeLine 'A frog jumps'
    writer.writeLine 'Water’s sound!'
}

//But for such a simple example, using the << operator would have been enough:
new File('somefile1.txt') << '''Into the ancient pond
A frog jumps
Water’s sound!'''

//write bytes
new File('somebytes.txt').bytes = [66, 22, 11]

//traverse a file tree
new File('.').eachFile {file -> println(file.name)}
//traverse a file tree in order to find some specific files
new File('.').eachFileMatch(~/.*\.txt/) { file -> println file.name}

//Often you will have to deal with a deeper hierarchy of files, in which case you can use eachFileRecurse
new File('.').eachFileRecurse { file -> println file.name }
new File('.').eachFileRecurse(FileType.FILES) { file -> println file.name }

println('traverse method===================')
//For more complex traversal techniques you can use the traverse method, which requires you to set a special flag indicating what to do with the traversal:
new File('.').traverse { file ->
    if (file.directory && file.name=='bin') {
        FileVisitResult.TERMINATE
    } else {
        println file.name
        FileVisitResult.CONTINUE
    }
}

println('execute method===================')
//Groovy provides a simple way to execute command line processes
def process = "ls -l".execute()
println "Found text ${process.text}"

//or process the resulting stream a line at a time
def process1 = "ls -l".execute()
process1.in.eachLine { line ->
    println '=' + line
}