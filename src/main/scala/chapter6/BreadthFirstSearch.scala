package chapter6

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

case class Person(name: String, isSeller: Boolean = false)

object BreadthFirstSearch {

  def createGraph(): mutable.HashMap[Person, Array[Person]] = {
    val graph: mutable.HashMap[Person, Array[Person]] = mutable.HashMap.empty[Person, Array[Person]]

    graph.put(Person("you"), Array(Person("alice"), Person("bob"), Person("claire")))
    graph.put(Person("bob"), Array(Person("anuj"), Person("peggy", isSeller = true)))
    graph.put(Person("alice"), Array(Person("peggy", isSeller = true)))
    graph.put(Person("claire"), Array(Person("thom", isSeller = true), Person("jonny")))
    graph.put(Person("anuj"), Array.empty[Person])
    graph.put(Person("peggy", isSeller = true), Array.empty[Person])
    graph.put(Person("thom", isSeller = true), Array.empty[Person])
    graph.put(Person("jonny"), Array.empty[Person])
    graph
  }

  def searchForSeller(): Option[String] = {
    val queue: mutable.Queue[Person] = mutable.Queue.empty[Person]
    val graph: mutable.HashMap[Person, Array[Person]] = createGraph()
    val searched: ArrayBuffer[Person] = ArrayBuffer.empty[Person]

    queue.enqueueAll(graph(Person("you")))

    var res: Option[String] = None

    while (queue.nonEmpty && res.isEmpty) {
      val person = queue.dequeue()
      if (!searched.contains(person)) {
        if (person.isSeller) res = Some(person.name)
        else {
          queue.enqueueAll(graph(person))
          searched.append(person)
        }

      }
    }

    res

  }

}
