package chapter1

import scala.math.Ordering.Implicits._

object IntroductionToAlgorithms {

  def binarySearch[A](array: Array[A], itemToFind: A)(implicit ord: Ordering[A]): Option[Int] = {

    var segmentBeginning: Int = 0
    var segmentEnding: Int = array.length - 1

    var itemIndex: Option[Int] = None

    while (segmentBeginning <= segmentEnding) {

      val segmentMiddle: Int = (segmentBeginning + segmentEnding) / 2
      val guess: A = array(segmentMiddle)

      if (guess == itemToFind) {
        itemIndex = Some(segmentMiddle)
        return itemIndex
      } else if (guess < itemToFind) segmentBeginning = segmentMiddle + 1
      else segmentEnding = segmentMiddle - 1
    }

    itemIndex

  }

}
