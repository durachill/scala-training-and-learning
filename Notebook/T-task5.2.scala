object Main {
  val MOD: Long = 1000000007L

  def main(args: Array[String]): Unit = {
    val scanner = new java.util.Scanner(System.in)
    val n = scanner.nextInt()
    val k = scanner.nextInt()

    val maxSize = n + k + 10
    val fact = Array.fill(maxSize)(1L)
    val invFact = Array.fill(maxSize)(1L)

    for (i <- 2 until maxSize) {
      fact(i) = fact(i - 1) * i % MOD
    }

    invFact(maxSize - 1) = pow(fact(maxSize - 1), MOD - 2)
    for (i <- maxSize - 2 to 0 by -1) {
      invFact(i) = invFact(i + 1) * (i + 1) % MOD
    }

    def comb(a: Int, b: Int): Long = {
      if (b < 0 || b > a) 0
      else fact(a) * invFact(b) % MOD * invFact(a - b) % MOD
    }

    val dp = Array.fill(n + 1)(0L)
    dp(0) = 1

    for (num <- 1 to n) {
      val newDp = dp.clone()
      
      for (sum <- 0 to n) {
        if (dp(sum) > 0) {
          var count = 1
          while (sum + count * num <= n) {
            val newSum = sum + count * num
            val ways = comb(count + k - 1, k - 1)
            newDp(newSum) = (newDp(newSum) + dp(sum) * ways) % MOD
            count += 1
          }
        }
      }
      for (i <- 0 to n) {
        dp(i) = newDp(i)
      }
    }

    println(dp(n))
  }

  def pow(base: Long, exponent: Long): Long = {
    var result = 1L
    var b = base
    var e = exponent
    while (e > 0) {
      if ((e & 1) == 1) {
        result = result * b % MOD
      }
      b = b * b % MOD
      e >>= 1
    }
    result
  }
}
