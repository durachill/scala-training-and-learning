error id: file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/Notebook/T-task2.scala:scala/Int#
file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/Notebook/T-task2.scala
empty definition using pc, found symbol in pc: scala/Int#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Int#
	 -scala/Predef.Int#
offset: 293
uri: file://<HOME>/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B/scala-projects/Notebook/T-task2.scala
text:
```scala
object Main {
  def main(args: Array[String]): Unit = {
    val t = scala.io.StdIn.readInt()
    
    for (_ <- 0 until t) {
      val n = scala.io.StdIn.readInt()
      val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
      println(solve(arr))
    }
  }
  
  def solve(arr: Array[I@@nt]): String = {
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
      if (cnt % 2 == 1) "First" else "Second"
    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Int#