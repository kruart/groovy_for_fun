package groovy.core.fundamental

class MainCustomException extends Exception {
    //Parameterless constructor
    MainCustomException() {
    }

    //Constructor that accepts a message
    MainCustomException(String message) {
        super(message)
    }
}
