package groovy.advanced.functional

/**Created by kruart on 24.08.2018.*/
List nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]

assert 36 == nums.collect {it * 2}  //map in java
        .findAll({it % 3 == 0})     //filter
        .sum()                      //sum

List cities = ['Boston', 'New York', 'London', 'Hyderabad']

assert cities.collect {it.toUpperCase()}    //map
        .sort()
        .join(', ') == 'BOSTON, HYDERABAD, LONDON, NEW YORK'