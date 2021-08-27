object solution1 extends App {

  def twoInt(a: Int, b: Int): Int = {
    if (a > b) a else b

  }

  def threeInt(three: (Int, Int, Int), two: (Int, Int) => Int): Int = {

    two(three._1, two(three._2, three._3))
  }

  println(threeInt((1, 2, 7), twoInt))
}
