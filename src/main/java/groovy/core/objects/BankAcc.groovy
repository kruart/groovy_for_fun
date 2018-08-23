package groovy.core.objects

import groovy.transform.TupleConstructor

/**Created by kruart on 23.08.2018.
 *  We can use @TupleConstructor for example in those occasions when we have to many fields. So when we use this annotation we can
 *  initialize our fields in order that they are declared in that way:
 *  BankAcc bankAcc = new BankAcc("₴", "34 892", "#3929388493", "email@email.net", "pass")
 * */

@TupleConstructor
class BankAcc {
    String currency
    String amount
    String accountNumber
    String emailToBanking
    String password
}
