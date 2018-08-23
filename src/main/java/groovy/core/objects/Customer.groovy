package groovy.core.objects

/**Created by kruart on 23.08.2018.*/
class Customer {
    String mailingName
    String address
    final Date dateOfBirth //to initialize final field we need to create our own constructor

    Customer(Date date) {
        this.dateOfBirth = date
    }
    //It's the only way to 'forbid' access to our getter method
    //Even we make it private, it doesn't help ((
    String getMailingName() {
        throw new IllegalAccessException()
    }

    void setMailingName(String mailingName) {
        println("SET METHOD MAILING NAME")
        this.mailingName = mailingName
    }
    
    String getAddress() {
        println("ADDRESS")
        return address
    }
}
