package groovy.practical.ast.builder

import groovy.transform.Canonical
import groovy.transform.builder.Builder

import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Builder
@Canonical
class Hero {
    String secretIdentity
    String name
    String company
    String job
    LocalDate hireDate
}

Hero hero = Hero
        .builder()
        .secretIdentity('Robert Parr')
        .name('Mr. Incredible')
        .company('InsuraCare')
        .job('Adjuster')
        .hireDate(LocalDate.parse('29/04/2015', DateTimeFormatter.ofPattern('dd/MM/yyyy')))
        .build()

println hero
assert hero.name == 'Mr. Incredible'
assert hero.secretIdentity == 'Robert Parr'
assert hero.company == 'InsuraCare'
assert hero.job == 'Adjuster'

hero = Hero
        .builder()
        .secretIdentity('Helen Parr')
        .name('ElastiGirl')
        .job('Domestic Goddess')
        .hireDate(LocalDate.parse('29/04/2015', DateTimeFormatter.ofPattern('dd/MM/yyyy')))
        .build()

println hero
assert hero.name == 'ElastiGirl'
assert hero.secretIdentity == 'Helen Parr'