package ProgrammingInScala.chapter21

object Rectangle {
  def main(args: Array[String]): Unit = {
    val myRectangle = 4 x 5
    println(myRectangle.height)
  }

  case class Rectangle(width: Int, height: Int)

  implicit class RectangleMaker(width: Int) {
    def x(height: Int) = Rectangle(width, height)
  }
}
