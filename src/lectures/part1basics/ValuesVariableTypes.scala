package lectures.part1basics

object ValuesVariableTypes extends App {

  // VALS are immutable
  // COMPILER can infer types ( type are optional )
  val x: Int = 42
  println(x)

  val aString: String = "hello"
  val aBoolean: Boolean = false
  val aChar : Char = 'a'
  val aInt : Int = x
  val aShort : Short = 4613
  val aLong : Long = 454534553635653L
  val aFloat : Float = 2.0f
  val aDouble : Double = 3.14 // default Double

  // Variables
  var aVariable : Int = 4
  // we can reassign
  aVariable = 5




}
