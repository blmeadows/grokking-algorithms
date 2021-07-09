package chapter4

import Quicksort._

class QuicksortSpec extends munit.ScalaCheckSuite {
  test("sum") {
    val array = Array(1, 2, 3, 4, 5)
    assert(sum(array) == 15)
  }

  test("sumRecursive") {
    val array = Array(5, 4, 3, 2, 1)
    assert(sumRecursive(array) == 15)
  }

  test("findMax") {
    val array = Array(4, 2, 5, 1, 3)
    assert(findMax(array) == 5)
  }

  test("quicksort") {
    val array = Array(4, 2, 5, 1, 3)
    assert(quicksort(array) sameElements Array(1, 2, 3, 4, 5))
  }
}
