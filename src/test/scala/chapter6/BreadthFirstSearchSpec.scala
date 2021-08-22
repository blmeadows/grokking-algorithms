package chapter6

import chapter6.BreadthFirstSearch._

class BreadthFirstSearchSpec extends munit.ScalaCheckSuite {
  test("search for seller") {
    assert(searchForSeller().contains("peggy"))
  }
}
