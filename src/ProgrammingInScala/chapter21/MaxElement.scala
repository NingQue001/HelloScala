package ProgrammingInScala.chapter21

object MaxElement {
  def main(args: Array[String]): Unit = {
    val list = List(1, 8, 9)
    println(maxListImpParam(list))
  }
  def maxListImpParam[T](elements: List[T])
                        (implicit ordering: Ordering[T]): T =
    elements match  {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListImpParam(rest)
        if(ordering.gt(x, maxRest)) x
        else maxRest
    }
}
