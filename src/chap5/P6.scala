package chap5

object P6 extends App {
  def conditional[A](x: A)(p: A => Boolean)(f: A => A):A = {
    if ( p(x) ) f(x) else x
  }

  val factorOf = (x: String) => (x.toInt%15) == 0 || (x.toInt%3) == 0 || (x.toInt%5) == 0
  val getPrint = (x: String) => {
    if (x.toInt%15==0) "typesafe"
    else if (x.toInt%3==0) "type"
    else if (x.toInt%5==0) "safe"
    else ""
  }
  for (i <- 1 to 100) {
    println(conditional(i.toString)(factorOf)(getPrint))
  }

  println("="*50)

  def conditional2[A](x: A)(p: A => Boolean)(f: A => Any):Any = {
    if ( p(x) ) f(x) else x
  }

  val factorOf2 = (x: Int) => (x%15) == 0 || (x%3) == 0 || (x%5) == 0
  val getPrint2 = (x: Int) => {
    if (x%15 == 0) "typesafe"
    else if (x%3 == 0) "type"
    else if (x%5 == 0) "safe"
    else ""
  }
  for (i <- 1 to 100) {
    println(conditional2(i)(factorOf2)(getPrint2))
  }
}
