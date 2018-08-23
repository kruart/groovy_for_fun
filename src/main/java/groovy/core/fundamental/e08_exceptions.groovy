package groovy.core.fundamental

//all exceptions in groovy are unchecked
void dbTest() {
    try {
        Class.forName("non-existence class")    //throw java.lang.ClassNotFoundException
    } catch (ClassNotFoundException e) {
        println("Sorry, something was wrong: " + e.getMessage())
        throw new MainCustomException("MISTAKE")
    }
}

dbTest()
