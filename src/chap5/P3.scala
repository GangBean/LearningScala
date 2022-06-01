package chap5

object P3 extends App {
  def multi(x : Int) : Int => Int = {
    (a: Int) => x * a
  }

  println(multi(2)(5))
}
