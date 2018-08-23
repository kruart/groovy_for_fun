package groovy.core.collections

List strings = 'this is a list of string'.split()

println(strings.sort())         //[a, is, list, of, string, this]
println(strings.sort(false))    //[a, is, list, of, string, this]

//sort with 2-param closure
println(strings.sort(false,
        {e1, e2 -> e1.size() <=> e2.size()}))   //[a, is, of, list, this, string]

println(strings.sort(false, {it.size()}))       //[a, is, of, list, this, string]

//java sort
Collections.sort(strings)
Collections.sort(strings,
        {o1, o2 -> o1.size() <=> o2.size()} as Comparator)  //[a, is, of, list, this, string]
println(strings)
