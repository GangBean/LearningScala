package chap4

object P5 extends App {
  println(math.pow(2,5000))

  println(pow(2,5000))

  @annotation.tailrec
  def pow(x:Double, y:Double, z:Double=1):Double = {
    if (y == 0) return z
    pow(x, y-1, z * x)
  }
}
