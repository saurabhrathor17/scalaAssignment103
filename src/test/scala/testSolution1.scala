import org.scalatest.funsuite.AnyFunSuite

class testSolution1 extends AnyFunSuite{
  test("solution1"){
assert(solution1.twoInt(8,9)==9)
    assert(solution1.threeInt((1,2,3),solution1.twoInt)===3)

  }

}
