package chap3

object Chap3_4 extends App {
  for (x <- 0 until 20) {
    for (y <- 5 * x + 1 to 5 * x + 5) {
      print(s"${y}")
      if (y != 100) print(", ")
    }
    println()
  }
}
