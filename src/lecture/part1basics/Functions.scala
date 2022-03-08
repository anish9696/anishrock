package lecture.part1basics

object Functions extends App{

  //defining a function in scala
  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("hello", 3))

  def aFunctionBlock(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunctionBlock("Hello", 5))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n== 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))

  //When you need loop , use recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  def aGreetingFunction(aName: String, aAge: Int): String = {
    "Hi, my name is "+aName+" and I am "+aAge+"years old"
  }

  println(aGreetingFunction("Anish", 26))

  def aFactorial(n: Int): Int = {
    if (n <= 0) 1
    else n * aFactorial(n-1)
  }

  println(aFactorial(5))

  def aFibonacci(n: Int): Int = {
    if (n ==1 || n == 2 ) 1
    else aFibonacci(n-1) + aFibonacci(n-2)
  }

  println(aFibonacci(5))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean ={
      if (t <= 2) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37*17))
}
