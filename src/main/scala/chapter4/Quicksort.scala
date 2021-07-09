package chapter4

import scala.annotation.tailrec
import scala.util.Random

object Quicksort {
  def sum(array: Array[Int]): Int = {
    var total = 0
    for (x <- array) total += x
    total
  }

  def sumRecursive(array: Array[Int]): Int =
    if (array.isEmpty) 0
    else array.head + sum(array.tail)

  def findMax(array: Array[Int]): Int = {
    @tailrec
    def find(array: Array[Int], max: Int): Int = {
      if (array.isEmpty) max
      else if (array.head > max) find(array.tail, array.head)
      else find(array.tail, max)
    }

    find(array, 0)
  }

  def quicksort(array: Array[Int]): Array[Int] = {
    if (array.length <= 1) array
    else {
      val pivot = array(Random.between(0, array.length))

      val less = array.filter(_ < pivot)
      val equal = array.filter(_ == pivot)
      val greater = array.filter(_ > pivot)

      quicksort(less) ++ equal ++ quicksort(greater)
    }
  }
}
