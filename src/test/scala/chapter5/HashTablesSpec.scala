package chapter5

import chapter5.HashTables._

class HashTablesSpec extends munit.ScalaCheckSuite {
  test("produce book price lookup") {
    assert(produceBook("avocado") == 1.49)
  }

  test("phone book lookup") {
    assert(phoneBook("jenny") == 8675309)
  }

  test("check voter") {
    assert(checkVoter("tom"))
    assert(checkVoter("mike"))
    assert(!checkVoter("mike"))
  }
}
