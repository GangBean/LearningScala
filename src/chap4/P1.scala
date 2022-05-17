package chap4

object P1 extends App {
  /**
   * 반지름이 주어졌을 때 원의 면적을 구하는 함수
   */
  def calcAreaOfCircle(r : Double):Double = {
    r * r * 3.14
  }

  print(calcAreaOfCircle(5))
}
