package chapter5

import scala.collection.mutable

object HashTables {
  val produceBook: mutable.HashMap[String, Double] = mutable.HashMap.empty[String, Double]
  produceBook.put("apple", 0.67)
  produceBook.put("milk", 1.49)
  produceBook.put("avocado", 1.49)

  val phoneBook: mutable.HashMap[String, Int] = mutable.HashMap.empty[String, Int]
  phoneBook.put("jenny", 8675309)
  phoneBook.put("emergency", 911)

  val voted: mutable.HashMap[String, Boolean] = mutable.HashMap.empty[String, Boolean]
  def checkVoter(name: String): Boolean = {
    if (voted.contains(name)) false
    else {
      voted.put(name, true)
      true
    }
  }
}
