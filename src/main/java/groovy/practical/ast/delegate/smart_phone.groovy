package groovy.practical.ast.delegate

/**Created by kruart on 25.08.2018.*/
class Phone {
    String dial(String num) {
        "Dialing $num..."
    }
}

class Camera {
    String takePicture() {
        'Takin picture...'
    }
}

class SmartPhone {
    @Delegate Phone phone = new Phone()
    @Delegate Camera camera = new Camera()
}

SmartPhone sp = new SmartPhone()
println sp.dial("555-1234")
println sp.takePicture()