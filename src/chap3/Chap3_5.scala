package chap3

object Chap3_5 extends App {
  val ret = for (x <- 1 to 100) yield {
    x match {
      case x if (x % 3 == 0) => {
        if (x % 5 == 0) "typesafe" else "type"
      }
      case x if (x % 5 == 0) => "safe"
      case _ => x
    }
  }
  for (x <- ret) {
    println(s"${x}")
  }
  // print(ret)
}
