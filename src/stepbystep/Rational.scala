package stepbystep

class Rational(n: Int, d: Int) {
  require(d != 0) //precondition 预处理

  private val g = gcd(n, d)
  val numerator = n / g
  val denominator = d /g

  def this(n: Int) = this(n, 1) //auxiliary constructor 辅助构造器

  def + (that: Rational): Rational =
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  def + (i: Int): Rational =
    new Rational(numerator + i * denominator, denominator)

  def - (that: Rational): Rational =
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )

  def - (i: Int): Rational =
    new Rational(numerator - i * denominator, denominator)

  def * (that: Rational): Rational =
    new Rational(numerator * that.numerator, denominator * that.denominator)

  def * (i: Int): Rational =
    new Rational(numerator * i, denominator)

  override def toString = numerator + "/" + denominator
  /**
   * get greatest common divisor of the two integer
   * @param a
   * @param b
   * @return
   */
  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)

}
