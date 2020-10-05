package ProgrammingInScala.chapter10

object Element {
  def main(args: Array[String]): Unit = {
    println((Array(1, 2, 3) zip Array("a", "b")).mkString("\n"))
    val arrayElement = new ArrayElement(Array("Hello")) above
                       new ArrayElement(Array("World!"))
    println(arrayElement.width)

    val arrayElement2 = new ArrayElement(Array("one", "two")) beside
                        new ArrayElement(Array("one"))
    println(arrayElement2.width)

    val x = new String("abc")
    val y = new String("abc")
    println("x == y : " + (x == y))
    println("x eq y : " + (x eq y))

  }

  private class ArrayElement(val contents: Array[String]) extends Element

  private class UniformElement(
                              ch: Char,
                              override val width: Int,
                              override val height: Int
                              ) extends Element {
    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }

  //factory method
  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)
}

import Element.elem
abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width =
    if (height == 0) 0 else contents(0).length

  def above(that: Element): Element =
    //父类可以使用子类 多态（Polymorphism）？？？
    elem(this.contents ++ that.contents)

  def beside(that: Element): Element = {
    val contents = new Array[String](this.contents.length)
    //use the factory method to construct an element
    elem(
      for(
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  }

  override def toString: String = contents mkString "\n"
}
