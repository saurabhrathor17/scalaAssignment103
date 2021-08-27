object solution4 extends App {


  def fzero(x: Int, f: Int => Unit): Int = {
    f(x)
    x
  }

  fzero(5, Integer => println("this is value:" + Integer))

}