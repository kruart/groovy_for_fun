package groovy.practical.json

import groovy.json.JsonSlurper

def text = new File('people.json').text
def json = new JsonSlurper().parseText(text)
assert json[1].role == 'witch'
println(json[1].role)
