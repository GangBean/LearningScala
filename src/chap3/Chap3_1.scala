package chap3

object Chap3_1 extends App {
  val name = "Tom"
  val ret = name match {
    case "" => "n/a"
    case _ => name
  }
  print(ret)
}
