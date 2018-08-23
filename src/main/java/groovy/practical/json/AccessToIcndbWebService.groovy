package groovy.practical.json

import groovy.json.JsonSlurper

//more about api: http://www.icndb.com/api/
String baseUrl = 'http://api.icndb.com/jokes/random?'
def params = [limitTo: '[nerdy]', firstName: 'Lili', lastName: 'Big']
        .collect() {k, v -> "$k=$v"}
        .join('&')

//get json from url
String jsonText = "${baseUrl}${params}".toURL().text
def json = new JsonSlurper().parseText(jsonText)
println(json.value.joke)
