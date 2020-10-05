package ProgrammingInScala.chapter19

class Animal
class Monkey extends Animal
class HappyMonkey extends Monkey
class aList[-T](t: T) { //contravariant
  def use[U <: T](u: U): Unit = { //upper bound
    print(u)
  }
}
class convariant[+T](t: T) {
  def use[Q >: T](q: Q) = { //down bound 下界ß

  }
}
object ConvariantTest {
  def main(args: Array[String]): Unit = {
    val a1 = new aList[Monkey](new HappyMonkey)
    println(a2)
  }
}
