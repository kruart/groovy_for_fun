package groovy.core.objects

//we can use that way to initialize fields if we don't have our own constructor
User user = new User(name: "darkNet", password: "darkPass", email: "dartk@dark.net")
user.email= "bright@bright.net" //even use field name - groovy make method call through getters and setters

//@@TupleConstructor ... allows us to initialize fields in order the they are declared
BankAcc bankAcc = new BankAcc("₴", "34 892", "#3929388493", "email@email.net", "pass")

//but if we have our own constructor, we can use only that way to initialize fields
//Customer customer = new Customer(mailingName: "EMAIL", address: "Avenue 17")  // we cannot use that way
Customer customer = new Customer(new Date())    //only our own constructor
println(customer.getDateOfBirth())

customer.setAddress("Avenue 19")
//If you want to retrieve the field instead of calling the getter, you can use the direct field access operator
println(customer.@address)