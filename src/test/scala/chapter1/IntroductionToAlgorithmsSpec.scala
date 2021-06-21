package chapter1

import chapter1.IntroductionToAlgorithms._
import org.scalacheck.Prop.forAll

class IntroductionToAlgorithmsSpec extends munit.ScalaCheckSuite {
  test("binary search with Int") {
    val array = Array(1, 3, 5, 7, 9)
    assert(binarySearch(array, 3).contains(1))
    assert(binarySearch(array, -1).isEmpty)
  }

  test("binary search with Float") {
    val array =
      Array(BigDecimal(1.5), BigDecimal(3.5), BigDecimal(5.5), BigDecimal(7.5), BigDecimal(9.5))
    assert(binarySearch(array, BigDecimal(3.5)).contains(1))
    assert(binarySearch(array, BigDecimal(-1.0)).isEmpty)
  }

  test("binary search compared to indexOf") {
    val array = Array(1, 3, 5, 7, 9)
    assert(binarySearch(array, 3).get == array.indexOf(3))
  }

  property("binary search pbt Int") {
    forAll { (array: Array[Int]) =>
      val processedArray = array.distinct.sorted.filterNot(_ == -1)
      if (processedArray.nonEmpty) {
        val index = 0
        val itemToFind = processedArray(index)
        assert(binarySearch(processedArray, itemToFind).contains(index))
        assert(binarySearch(processedArray, itemToFind).get == processedArray.indexOf(itemToFind))
        assert(binarySearch(processedArray, -1).isEmpty)
      }
    }
  }

}
