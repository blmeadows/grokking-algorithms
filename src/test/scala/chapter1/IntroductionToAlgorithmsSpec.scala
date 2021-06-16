package chapter1

import chapter1.IntroductionToAlgorithms._
import org.scalacheck.Prop.forAll

class IntroductionToAlgorithmsSpec extends munit.ScalaCheckSuite {
  test("binary search with Int") {
    val list = Array(1, 3, 5, 7, 9)
    assert(binarySearch(list, 3).contains(1))
    assert(binarySearch(list, -1).isEmpty)
  }

  test("binary search with Float") {
    val list =
      Array(BigDecimal(1.5), BigDecimal(3.5), BigDecimal(5.5), BigDecimal(7.5), BigDecimal(9.5))
    assert(binarySearch(list, BigDecimal(3.5)).contains(1))
    assert(binarySearch(list, BigDecimal(-1.0)).isEmpty)
  }

  property("binary search pbt Int") {
    forAll { (array: Array[Int]) =>
      val processedArray = array.distinct.sorted.filterNot(_ == -1)
      if (processedArray.nonEmpty) {
        val index = 0
        val itemToFind = processedArray(index)
        assert(binarySearch(processedArray, itemToFind).contains(index))
        assert(binarySearch(processedArray, -1).isEmpty)
      }
    }
  }

  property("binary search pbt BigDecimal") {
    forAll { (array: Array[BigDecimal]) =>
      val processedArray = array.distinct.sorted.filterNot(_ == -1.5)
      if (processedArray.nonEmpty) {
        val index = 0
        val itemToFind = processedArray(index)
        assert(binarySearch(processedArray, itemToFind).contains(index))
        assert(binarySearch(processedArray, BigDecimal(-1.5)).isEmpty)
      }
    }
  }

}
