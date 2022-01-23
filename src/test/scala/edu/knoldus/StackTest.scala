package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

import scala.sys.error

class StackTest extends AnyFlatSpec {
  val obj=new Generic
  "Condition" should  "give true if stack is Empty" in{
    assert(obj.isEmpty==true)
  }
  "Condition" should " provide top element in stack" in {
    obj.push(7)
    obj.push(8)
    assert(obj.top==8)
  }
  "condition" should "Pop element from stack" in{
    obj.push(3)
    obj.push(4)
    obj.push(5)
    obj.push(10)
    obj.pop()
    assert {
      obj.top == 5
    }
  }
}
