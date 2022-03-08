package lecture.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App{

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else factorial(n-1) * n
  }

  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)

    factHelper(n,1)
  }

  print(anotherFactorial(10))

  // WHEN YOU NEED LOOPS , USE TAIL RECURSION

  @tailrec
  def concatenateString(message: String, n: Int, accumulator: String): String ={
    if (n < 0) message
    else concatenateString(message, n-1, message+accumulator)
  }

  def isPrime(num: Int) : Boolean = {
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      if (t <= 1) true
      else isPrimeTailrec(t-1, num % t != 0 && isStillPrime)
    }
    isPrimeTailrec( num/2, true)
  }

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def fib(n: Int): Int = {
    def fibotailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if ( i >= n) last
      else fibotailrec(i+1, last+ nextToLast, last)
    }

    if (n <= 2 ) 1
    else fibotailrec(2, 1, 1)
  }
}
