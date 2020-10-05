import java.util.function.Predicate

import stepbystep.Rational

object HelloScala {
  def main(args: Array[String]): Unit = {
    var assertionEnabled = false
    def myAssert(predicate: => Boolean) =
      if(assertionEnabled && !predicate)
        throw new AssertionError

    def booleanAssert(predicate: Boolean) =
      if(assertionEnabled && !predicate)
        throw new AssertionError

    val x = 5
    myAssert(x / 0 == 0)
//    booleanAssert(x / 0 == 0)

    def FunnyMudPee(t: => Boolean) =
      if(t) "Funny Mud Pee" else "Forbid pee"

    println(FunnyMudPee(5 < 3))
    
  }
}
