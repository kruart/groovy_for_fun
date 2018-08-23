package groovy.core.collections

List nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]
println(nums.sum()) //36
//groovy using collect
println(nums.collect({it * 2}).sum())   //72 == sum * 2
//reduce a problem already solved
println(nums.sum() * 2)  //72
//sum with closure. (equivalent to the collect)
println(nums.sum({it * 2})) //72

//Sum with spread-dot
println(nums*.multiply(2).sum())    //72
println((nums * 2).sum())   //72

//use inject. Inject it like reduce function in Java
println(nums.inject(0) {acc, value -> acc + (value * 2)})   //72
