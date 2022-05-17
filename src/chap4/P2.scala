package chap4

object P2 extends App {
  def calcAreaOfCircle(r : String) : Double = {
    r.toDouble * r.toDouble * 3.14
  }

  print(calcAreaOfCircle(""))
}
