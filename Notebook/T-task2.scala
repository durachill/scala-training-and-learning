object Main {
  def main(args: Array[String]): Unit = {
    val t = scala.io.StdIn.readInt()
    
    for (_ <- 0 until t) {
      val n = scala.io.StdIn.readInt()
      val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
      println(solve(arr))
    }
  }
  
  def solve(arr: Array[Int]): String = {
    val sortedArr = arr.sorted
    val n = sortedArr.length
    
    var foundInvalid = false
    for (i <- 0 until n if !foundInvalid) {
      if (sortedArr(i) > i + 1) {
        foundInvalid = true
      }
    }
    
    if (foundInvalid) {
      "Second"
    } else {
      val totalSum = sortedArr.sum
      val expectedSum = n * (n + 1) / 2
      val cnt = expectedSum - totalSum
      if (cnt % 2 == 1) {
        "First"
        } 
      else "Second"
    }
  }
}