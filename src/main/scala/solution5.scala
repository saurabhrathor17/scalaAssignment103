object solution5 extends App {

  def conditionCheck[dataType](x: dataType, p: dataType => Boolean, f: dataType => dataType): dataType = {
    if (p(x)) f(x) else x
  }

  println(conditionCheck[Int](234, _ == 234, _.+(6)))

}
