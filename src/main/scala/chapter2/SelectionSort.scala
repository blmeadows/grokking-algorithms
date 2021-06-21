package chapter2

import scala.math.Ordering.Implicits._

object SelectionSort {

  def selectionSort[A](array: Array[A])(implicit ord: Ordering[A]): Unit = {
    for (i <- array.indices) {
      var smallestIndex = i
      for (j <- i + 1 until array.length)
        if (array(j) < array(smallestIndex))
          smallestIndex = j
      val temp = array(smallestIndex)
      array.update(smallestIndex, array(i))
      array.update(i, temp)
    }
  }

}
