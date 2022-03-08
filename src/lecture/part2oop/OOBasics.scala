package lecture.part2oop

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  println(person.greet("Anish"))
  println(person.greet())

}

//class Person(name: String,val age: Int) //constructor
class Person(name: String, val age: Int) {
  //body
  val x = 2
  println(1 +3)
 // def greet(name: String): Unit = println(s"$name says: Hi $name")
  def greet(name: String): Unit = println(s"${this.name} says hi, $name")

  def greet(): Unit = println(s"Hi, I am $name")



}