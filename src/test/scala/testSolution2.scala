import org.scalatest.funsuite.AnyFunSuite

class testSolution2 extends AnyFunSuite{
  test("solution2"){
    assert(solution2.higherOrderFunc((12,45,60),solution2.maximum)===60)
    assert(solution2.higherOrderFunc((12,45,60),solution2.smaller)===12)
    assert(solution2.higherOrderFunc((12,45,60),solution2.secondInteger)===60)

  }

}
