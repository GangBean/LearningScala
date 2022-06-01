package chap5

object P4 extends App {
  /**
   * def fzero[A](x:A)(f: A => Unit): A = { f(x); x }
   * 타입 A인 입력변수 a에 대해 출력이 없는 함수를 실행하고 a를 출력
   * : 입력값 x의 값과 타입을 출력하는 함수 f를 정의해 fzero에 입력값 a와 f를 넘겨서 실행하면 x의 값과 타입 정보를 출력하고 x를 반환
   */

  def fzero[A](x:A)(f: A => Unit): A = { f(x); x }
  val printInput = (x:Any) => {
    println(x)
  }
}
