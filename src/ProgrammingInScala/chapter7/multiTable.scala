package ProgrammingInScala.chapter7

object multiTable {
  def main(args: Array[String]): Unit = {
    println(multiTable())
  }

  def multiTable() = {
    //local function1
    def makRowSeq(row: Int) =
      for(col <- 1 to 10) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        prod + padding
      }

    //local function2
    def makeRow(row: Int) = makRowSeq(row).mkString

    val tableSeq =
      for(row <- 1 to 10)
        yield makeRow(row)

    tableSeq.mkString("\n")
  }

}
