package chap4

object P7 extends App {
 def intToFirst[A,B](a:(A,B)):(Any, Any) = {
   if (a._1.isInstanceOf[Int]) {
     if (a._2.isInstanceOf[Int]) a
     else (a._2, a._1)
   } else if (a._2.isInstanceOf[Int]) (a._2, a._1) else a
 }
  val info = (1.0d, 1)
  println(info)
  println(intToFirst(info))
}
