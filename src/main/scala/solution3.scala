object solution3 extends App {


  def higherOrderfunction(int: Int) = (x: Int) => println(int * x)

  val result = higherOrderfunction(int = 5)
  result(5)


}
