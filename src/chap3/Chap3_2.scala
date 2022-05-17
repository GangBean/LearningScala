package chap3

object Chap3_2 extends App {
  val amount: Double = 10
  val ret = if (amount > 0) "greater" else if (amount == 0) "same" else if (amount < 0) "less"
  val matches = amount match {
    case d if d > 0 => "greater"
    case d if d == 0 => "same"
    case d if d < 0 => "less"
  }

  println(ret)
  println(matches)
}
