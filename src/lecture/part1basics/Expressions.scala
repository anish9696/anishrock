package lecture.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2+3*4)
  // + - * / & |^ << >> >>> {right shift with zero extensions}
  // == != > >= <=

  println(1 == x)

  // ! && ||
  var aVariable = 2
  aVariable = 3
  println(aVariable)

  // Instruction (do) vs Expression (value)

  // If expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // If expression
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  val  aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side affects: println(), whiles, reassigning

  //code blocks

  val aCodeBlock = {
    val y = 2
    val z = 1
     if (z > 2) "hello" else "goodBye"
  }
  println(aCodeBlock)

  // differnce between  "hello world" vs println("hello world")?
  //value of string literal and println is a expression
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}
