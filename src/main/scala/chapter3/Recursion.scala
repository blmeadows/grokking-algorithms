package chapter3

import scala.annotation.tailrec

object Recursion {
  def factorial(num: Int): Int =
    if (num == 1) 1
    else num * factorial(num - 1)

  def factorialTailRecursive(num: Int): Int = {
    @tailrec
    def factorial(num: Int, acc: Int): Int =
      if (num <= 1) acc
      else factorial(num - 1, num * acc)
    factorial(num, 1)
  }
}
