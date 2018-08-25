package groovy.practical.ast.delegate

/**Created by kruart on 25.08.2018.*/
class PhoneWithManufacturer {
    String from

    String dial(String num) {
        "Dialing $num..."
    }
}

class CameraWithManufacturer {
    String from

    String takePicture() {
        'Taking picture...'
    }
}

class SmartPhoneWithManufacturer {
    @Delegate PhoneWithManufacturer phone = new PhoneWithManufacturer(from: 'Samsung')
    @Delegate CameraWithManufacturer camera = new CameraWithManufacturer(from: 'Nikon')

    String getFrom() {
        "Phone: ${phone.from}, Camera: ${camera.from}"
    }
}

SmartPhoneWithManufacturer sp = new SmartPhoneWithManufacturer()
assert sp.dial('555-1234') == 'Dialing 555-1234...'
assert sp.takePicture() == 'Taking picture...'

//assert sp.from == sp.phone.from //if not override 'from getter' than returns from first delegation object
println sp.from