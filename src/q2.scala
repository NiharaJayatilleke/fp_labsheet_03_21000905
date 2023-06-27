object q2 extends App {

  var fruit = List("kiwi", "pomegranate", "mango", "apple", "watermelon", "banana")
  val filtered = filterLength(fruit)

  def filterLength(l: List[String]): List[String] = {
    l.filter(_.length > 5)
  }

  filtered.foreach(println)
}
