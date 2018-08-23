package groovy.core.fundamental

println(3.getClass().getName()) //java.lang.Integer
println(3483948239.getClass().getName()) //java.lang.Long
println(93483289842398119002302.getClass().getName()) //java.math.BigInteger

println(343.3.getClass().getName()) //java.math.BigDecimal
println(343.3F.getClass().getName()) //java.lang.Float
println(343.3D.getClass().getName()) //java.lang.Double

def a1 = 2.0 - 1.1  //BigDecimal
def a2 = 2.0F - 1.1F  //Double
def a3 = 2.0D - 1.1D  //Double
def a4 = 2.0 - 1.1F  //Double
def a5 = 2.0 - 1.1D  //Double

println(a1) //0.9
println(a2) //0.8999999761581421
println(a3) //0.8999999999999999
println(a4) //0.8999999761581421
println(a5) //0.8999999999999999

println(3/5)         //0.6 class BigDecimal
println(3.intdiv(5)) //0 - division like in Java