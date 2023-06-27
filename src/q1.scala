object q1 extends App {

  var s = "tutorial"

  def revs(s: String): String = {
    if (s.length == 1) s
    else revs(s.tail) + s.head // tail - excluding first element
  }

    println("Reverse of '" + s + "' is '" + revs(s) + "'")
  }