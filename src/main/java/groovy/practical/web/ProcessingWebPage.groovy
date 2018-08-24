package groovy.practical.web

//println 'http://juventus.com'.toURL().text
//'http://juventus.com'.toURL().text.eachLine {println it}
//'http://juventus.com'.toURL().eachLine {println it}
//println 'http://juventus.com'.toURL().readLines()*.size() //count of chars in every lines
println 'http://juventus.com'.toURL().text.readLines()*.size() //count of chars in every lines
