package chap5

object P2 extends App {
  val a = scala.util.Random.nextInt()
  val b = scala.util.Random.nextInt()
  val max = (a :Int, b: Int) => if (a>b) a else b
  println(max(a,b))
  val min = (a: Int, b: Int) => if (a>b) b else a
  println(min(a,b))
  val second = (a: Int, b: Int) => b
  println(second(a,b))
}
