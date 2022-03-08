package lecture.part1basics

object StringOps extends App{
  val str: String ="Hello, i am learning scala"

  println(str.charAt(2))
  println(str.substring(2))
  println(str.substring(2,4))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))
  println(str.toLowerCase)
  println(str.toUpperCase)
  println(str.length)
  println(str.length())
  val aNumberString  = "45"
  println(aNumberString.toInt)
  val aNumber = aNumberString.toInt

  println(aNumber*10)
  println(str.reverse)
  println(str.take(2))

  //scala specific interpolator

  //s-interpolator

  val name = "Anish"
  val age = 25
  val greeting = s"Hello my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I wll be turning ${age + 1} years old"
  println(anotherGreeting)

  //F-Interpolator

  val speed = 1.2f
  val names = "Danish"
  val myth = f"$name can ear $speed%2.2f burgers per minute"
  println(myth)

  //RAW- Interpolator

  println(raw"This is a \n newline")

}
