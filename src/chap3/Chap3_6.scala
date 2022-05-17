package chap3

object Chap3_6 extends App {
  for (x <- 1 to 100) if (x % 3 == 0 && x % 5 == 0) println("typesafe") else if (x % 3 == 0) println("type") else if (x % 5 == 0) println("safe") else println(x)
}
