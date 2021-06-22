package lectures.part2oop

import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType
import lectures.part2oop.Objects.Person

object Inheritance extends App {

  // single class Inheritance
  /*sealed*/ class Animal {
    val typeAn: String = "general"
    def eat = println("lorem")
  }

  class Cat extends Animal {
    def cruch = {
      eat
      println("crunch ...")
    }
  }

  val cat = new Cat

  // only if is public in the super class
  // cat.eat
  cat.cruch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  // correct way to extends class with parameters
  class Adult(name: String, age: Int, idCard : String) extends Person(name, age)
  class Adult2(name: String, age: Int, idCard : String) extends Person(name)

  // overriding - ( wotks for methods and fields )
  class Dog(override val typeAn: String = "domestic") extends Animal {
    // override val typeAn: String = "domestic"
    override def eat: Unit = {
      super.eat
      println("overriding eat")
    }
  }

  val dog = new Dog
  dog.eat

  // type susbstitution ( polimorfismo )
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // overRIDING vs overLOADING

  // super ( ref method or field form parent class )

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal the class = extend classes in THIS FILE, prevent extension in other files

}
