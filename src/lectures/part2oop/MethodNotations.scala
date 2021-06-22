package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person (val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = favoriteMovie == movie
    def hangOutWith(person: Person): String = s"${this.name} is hangingout with ${person.name}"
    def +(person: Person): String = s"${this.name} is hangingout with ${person.name}"
    def unary_! : String = s"$name, DAJEEE : )"
    def isAlive: Boolean = true
    def apply():String = s"Hi my name is $name and i like $favoriteMovie"
    // exercises
    def +(nickname : String): Person = new Person(s"${name} ($nickname)", favoriteMovie)
    def unary_+ : Person = new Person(name,favoriteMovie, age + 1)
    def learns(thing: String) = s"$name learns $thing"
    def learnScala = this learns "Scala"
    def apply(n: Int): String = s"$name whatch $favoriteMovie $n times"
  }

  val mary = new Person("Mary", "film1")
  println(mary.likes("film1"))
  println(mary likes "film1") // equivalent ( only if there is a single parameter )
  // infix notation = operator notation ( syntactic sugar )

  // "operator" in Scala
  val tom = new Person("tom", "film2")
  println(mary hangOutWith tom)
  println(mary + tom)
  println(mary.+(tom))

  println(1+2)
  println(1.+(2))

  // All operators are methods
  // AKKA actors have ! ?

  // prefix notation
  val x = -1 // equivalent to 1.unary_-
  val y = 1.unary_-

  // unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  // i metodi che non ricevo nessun parametro hanno la possibilità di avere la
  // proprietà di essere usati come postfix
  println(mary.isAlive)
  println(mary isAlive)

  // apply - SPECIAL method
  println(mary.apply())
  println(mary()) // equivalente to mary.apply()

  /*
  1.  Overload the + operator
      mary + "the rockstar" => new person "Mary (the rockstar)"
  2.  Add an age to the Person class
      Add a unary + operator => new person with the age + 1
      +mary => mary with the age incrementer
  3.  Add a "learns" method in the Person class => "Mary learns Scala"
      Add a learnsScala method, calls learns method with "Scala".
      Use it in postfix notation.
  4.  Overload the apply method
      mary.apply(2) => "Mary watched Inception 2 times"
 */

  println((mary + "the Rockstar").apply())
  println((mary + "the Rockstar")())

  println((+mary).age)
  println((+mary).age)

  println(mary learnScala)
  println(mary learns "JAva")
  println(mary(10))
  println(mary.apply(999))

}
