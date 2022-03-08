package lecture.part1basics

object ValuesVariableTypes extends App {

  val x : Int =42
  //val x = 42 will also run
  println(x)
  // Val are immutaable
  // the types of val are optional
  //compiler can infer types

  val aString : String = "Hello"
  val anotherString = "World"
  val aBoolean: Boolean = true
  val aChar : Char = 'a'
  val anInt : Int = x
  val aShort : Short = 4613
  val aLong : Long = 49493039030303L
  val aFloat : Float = 2.0f
  val aDouble : Double = 3.19

  var aVariable = 4
  aVariable = 5 //side effect

}
