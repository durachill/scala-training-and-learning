import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val l = new Array[Long](n + 2)
    val r = new Array[Long](n + 2)
    val a = new Array[Long](n + 2)

    for (i <- 1 to n) {
      val tokens = scala.io.StdIn.readLine().split(" ").map(_.toLong)
      l(i) = tokens(0)
      r(i) = tokens(1)
      a(i) = tokens(2)
    }

    val leftMax = new Array[Long](n + 2)
    val rightMax = new Array[Long](n + 2)

    for (i <- 1 to n) {
      if (i > 1) {
        leftMax(i) = math.min(l(i), a(i - 1))
      }
    }

    for (i <- 1 until n) {
      if (i < n) {
        rightMax(i) = math.min(r(i), a(i + 1))
      }
    }

    val prefix = new Array[Long](n + 2)
    val suffix = new Array[Long](n + 2)

    for (i <- 1 to n) {
      prefix(i) = prefix(i - 1) + a(i)
      if (i > 1 && leftMax(i) < a(i - 1)) {
        prefix(i) = prefix(i - 1)
      }
    }

    for (i <- n to 1 by -1) {
      suffix(i) = suffix(i + 1) + a(i)
      if (i < n && rightMax(i) < a(i + 1)) {
        suffix(i) = suffix(i + 1)
      }
    }

    var ans = 0L
    for (i <- 1 to n) {
      var total = a(i)
      if (i > 1 && leftMax(i) >= a(i - 1)) {
        total += prefix(i - 1)
      }
      if (i < n && rightMax(i) >= a(i + 1)) {
        total += suffix(i + 1)
      }
      ans = math.max(ans, total)
    }

    println(ans)
  }
}
