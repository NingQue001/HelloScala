package ProgrammingInScala.chapter8

import java.io.{File, PrintWriter}

object FirstClassFunctions {
  def main(args: Array[String]): Unit = {
//    val list = List(1, -10, 8, 76)
//    list.foreach(println)
//    println(list.filter(_ > 0).mkString(" ")) //placeholder syntax
//    def sum(x: Int, y: Int, z: Int) = x + y + z
//    val a = sum(1, _, 2) //partially applied function
//    println(a(9))
//
//    def findNeg(nums: List[Int]) = nums.exists(_ < 0)

    def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
      val writer = new PrintWriter(file)
      try {
        op(writer)
      } finally {
        writer.close()
      }
    }

      val file2 = new File("/usr/local/tmp/date.txt")
      withPrintWriter(file2) { writer =>
        writer.println(new java.util.Date)
      }
    }
  }
