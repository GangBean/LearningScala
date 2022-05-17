package chap4

object P8 extends App {
  def valueToString(a:(Any,Any,Any)) = {
    (a._1,a._1.toString, a._2, a._2.toString, a._3, a._3.toString)
  }

  val info = (true, 22.25, "yes")
  val result:(Any, String, Any, String, Any, String) = valueToString(info)
  print(result + "->" + result._2.isInstanceOf[String])
}
