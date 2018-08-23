package groovy.core.fundamental

/**Created by kruart on 23.08.2018.*/
class ShiftingStrings {

    String stuff = ""

    String toString() {
        stuff
    }

    def leftShift(String moreStuff) {
        stuff +=moreStuff
    }
}
