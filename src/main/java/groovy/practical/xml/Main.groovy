package groovy.practical.xml

import groovy.xml.MarkupBuilder

class Customer {
    String name
    String email
}

def customer1 = [name: "Carlie", email: 'carlie@email.com']
def customer2 = [name: "Simon", email: 'simon@email.com']
def customer3 = [name: "Yvonne", email: 'yvonne@email.com']
def customers = [customer1, customer2, customer3]

//output to system.out by default
//def xmlBuilder = new MarkupBuilder()
//xmlBuilder.customers {
//    customers.eachWithIndex() { newtCustomer, index ->
//        customer("id":index) {
//            name(newtCustomer.name)
//            email(newtCustomer.email)
//        }
//    }
//}

//write to file
StringWriter sw = new StringWriter()
def xmlBuilder = new MarkupBuilder(sw)
xmlBuilder.customers {
    customers.eachWithIndex{ newtCustomer, index ->
        customer("id":index) {
            name(newtCustomer.name)
            email(newtCustomer.email)
        }
    }
}

File file = new File("customers.xml")
file << sw.toString()   //add xml to file

def xmlDoc = new XmlSlurper().parse("customers.xml")
xmlDoc.customer.each{nextCustomer ->
    println "id ${nextCustomer.@id.text()}"
    println "name ${nextCustomer.name}"
    println "email ${nextCustomer.email}"
}


