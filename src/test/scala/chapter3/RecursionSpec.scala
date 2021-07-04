package chapter3

import chapter3.Recursion._

class RecursionSpec extends munit.ScalaCheckSuite {

  test("factorial") {
    assert(factorial(5) == 120)
  }

  test("factorial tail recursive") {
    assert(factorialTailRecursive(5) == 120)
  }

}
