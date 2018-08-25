package groovy.practical.ast.sortable

import groovy.transform.Sortable

/**Created by kruart on 25.08.2018.*/
//@Sortable
//@Sortable(includes = ['score', 'last', 'first'])
@Sortable(includes = ['height', 'score', 'last', 'first'])
class Golfer {
    String first
    String last
    int score
    int height

    String toString() { "$score: $last, $first (${height})" }
}