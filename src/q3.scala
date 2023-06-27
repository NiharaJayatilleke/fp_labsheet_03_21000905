object q3 extends App {

  var n1 = 78
  var n2 = 65

  def getAvg(num1: Int, num2: Int): Double ={
    val tot = num1 + num2
    val avg = tot.toDouble / 2
    BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  println("Average is "+ getAvg(n1, n2))
}
