import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    
    val left = new Array[Long](n + 1)
    val right = new Array[Long](n + 1)
    val values = new Array[Long](n + 1)
    
    for (i <- 1 to n) {
      val tokens = StdIn.readLine().split(" ").map(_.toLong)
      left(i) = tokens(0)
      right(i) = tokens(1)
      values(i) = tokens(2)
    }

    var maxSum = 0L
    
    for (center <- 1 to n) {
      var currentSum = values(center)
      
      for (i <- center - 1 to 1 by -1) {
        if (right(i) >= values(i + 1)) {
          currentSum += values(i)
        } else {
}
      }
      
      for (i <- center + 1 to n) {
        if (left(i) >= values(i - 1)) {
          currentSum += values(i)
        }
      }
      
      maxSum = math.max(maxSum, currentSum)
    }
    
    println(maxSum)
  }
}
