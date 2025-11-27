object Main {
  val mod: Long = 1000000007L

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    
    val cnt = scala.collection.mutable.Map[Int, Int]()
    
    for (x <- arr) {
      cnt(x) = cnt.getOrElse(x, 0) + 1
    }
    
    var res: Long = 1
    for ((_, count) <- cnt) {
      res = (res * (count + 1)) % mod
    }
    
    println((res - 1 + mod) % mod)
  }
}
