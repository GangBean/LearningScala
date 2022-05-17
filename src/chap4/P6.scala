package chap4

object P6 extends App {
  def distance(a:(Double,Double),b:(Double,Double)):(Double,Double) = {
    val x = if (a._1 > b._1) a._1 - b._1 else b._1 - a._1
    val y = if (a._2 > b._2) a._2 - b._2 else b._2 - a._2
    (x,y)
  }

  println(distance((1,2), (3,5)))
}
