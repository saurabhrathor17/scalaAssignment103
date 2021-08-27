object solution2 extends App {
  //  def maxi =(x:Int, y:Int) => if (x > y) x else y
  //  def small =(x:Int, y:Int) => if (x > y) y else x

  // function that return max of two number
  def maximum(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  // function that returns smaller of two integers

  def smaller(a: Int, b: Int): Int = {
    if (a > b) b else a
  }

  def secondInteger(a: Int, b: Int) = b

  def higherOrderFunc(three: (Int, Int, Int), two: (Int, Int) => Int): Int = {

    two(three._1, two(three._2, three._3))
  }

  // generating random number
  def number = util.Random.nextInt

  val randomNumber = (number, number, number)


  println(higherOrderFunc(randomNumber, maximum)) // printing maximum
  println(higherOrderFunc(randomNumber, smaller)) // printing smaller
  println(higherOrderFunc(randomNumber, secondInteger)) // printing second element
}
