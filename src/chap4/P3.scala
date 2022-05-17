package chap4

object P3 extends App {
  @annotation.tailrec
  def recursiveCount(d : Int): Unit = {
    if ( d > 50 ) return
    println(d)
    recursiveCount(d + 5)
  }

  recursiveCount(5)
}
