package groovy.practical.json

import groovy.json.JsonBuilder

def builder = new JsonBuilder()
builder([name: 'Buffy', role: 'slayer'], [name: 'Willow', role: 'witch'])
println(builder)

new File("people.json").write(builder.toPrettyString())
