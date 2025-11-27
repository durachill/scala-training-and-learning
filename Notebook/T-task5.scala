import java.util.Scanner
import scala.collection.mutable.ArrayBuffer

object Main {
  val MOD: Long = 1000000007L

  def modpow(a: Long, e: Long): Long = {
    var res = 1L
    var base = a
    var exp = e
    while (exp > 0) {
      if ((exp & 1) == 1) {
        res = res * base % MOD
      }
      base = base * base % MOD
      exp >>= 1
    }
    res
  }

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val n = scanner.nextInt()
    val k = scanner.nextInt()

    val LIM = n + k + 5
    val fact = new Array[Long](LIM)
    val invfact = new Array[Long](LIM)

    fact(0) = 1
    for (i <- 1 until LIM) {
      fact(i) = fact(i - 1) * i % MOD
    }

    invfact(LIM - 1) = modpow(fact(LIM - 1), MOD - 2)
    for (i <- LIM - 2 to 0 by -1) {
      invfact(i) = invfact(i + 1) * (i + 1) % MOD
    }

    def C(a: Int, b: Int): Long = {
      if (a < 0 || b < 0 || b > a) 0
      else fact(a) * invfact(b) % MOD * invfact(a - b) % MOD
    }

    var dp = Array.fill(n + 1)(0L)
    dp(0) = 1

    for (i <- 1 to n) {
      val ndp = Array.fill(n + 1)(0L)
      for (s <- 0 to n if dp(s) != 0) {
        var t = 0
        while (s + t * i <= n) {
          val ways = C(t + k - 1, k - 1)
          ndp(s + t * i) = (ndp(s + t * i) + dp(s) * ways) % MOD
          t += 1
        }
      }
      dp = ndp
    }

    println(dp(n) % MOD)
  }
}
