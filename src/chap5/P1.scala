package chap5

object P1 extends App {
  val max = (a: Int, b:Int) => if (a>b) a else b

  def tripleMax( c : (Int,Int,Int))(f : (Int, Int) => Int): Int = {
    f(f(c._1, c._2),c._3)
  }

  println( tripleMax((1,2,3))(max))
}
