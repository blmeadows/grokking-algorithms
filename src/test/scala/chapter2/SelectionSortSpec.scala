package chapter2

import chapter2.SelectionSort.selectionSort
import org.scalacheck.Prop.forAll

class SelectionSortSpec extends munit.ScalaCheckSuite {
  test("selection sort on Array[Int]") {
    val array = Array(5, 3, 9, 7, 1)
    selectionSort(array)
    assert(array sameElements Array(1, 3, 5, 7, 9))
  }

  test("selection sort compared to sorted") {
    val array = Array(5, 3, 9, 7, 1)
    val arrayCopy = array.clone()
    selectionSort(array)
    assert(array sameElements arrayCopy.sorted)
  }

  test("selection sort pbt") {
    forAll { (array: Array[Int]) =>
      val arrayCopy = array.clone()
      selectionSort(array)
      assert(array sameElements arrayCopy.sorted)
    }
  }

}
