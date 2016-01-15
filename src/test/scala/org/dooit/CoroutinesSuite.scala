package org.dooit

import org.scalatest.{Matchers, BeforeAndAfterAll, FunSuite}
import org.coroutines._
/**
  * Created  01/14/2016 | 20:40
  *
  * @author : Johnnie Zhang
  * @version : 1.0.0
  * @since : 1.0.0
  *
  */
class CoroutinesSuite extends FunSuite with Matchers with BeforeAndAfterAll{

  test("Coroutines example "){
    val id = coroutine { (x: Int) => x }

    val c = call(id(7))

    c.resume
    println(s"result of coroutine is ${c.result}")

    c.result should be(7)
  }
}
