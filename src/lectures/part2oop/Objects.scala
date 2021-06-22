package lectures.part2oop

import scala.language.postfixOps

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS - class and object SAME name at same scope

  println(Person.N_EYES)
  println("canFly ",Person canFly)

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  println("SINGLETON INSTANCE ? ", mary == john)

  val person1 = Person
  val person2 = Person
  println("SINGLETON INSTANCE ? ", person1 == person2)

  val bobbie = Person(mary, john)
  // val bobbie = Person.apply(mary, john)
  println(bobbie.name)
  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit

  // if remove `extends App` you should add the previuosly method

  val k = 6.67e-11

}
