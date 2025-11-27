import java.util.Scanner
import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val n = scanner.nextInt()
    val m = scanner.nextInt()

    val U = Array.fill(m)(0)
    val V = Array.fill(m)(0)
    val g = Array.fill(n + 1)(ArrayBuffer[(Int, Int)]())

    for (i <- 0 until m) {
      val u = scanner.nextInt()
      val v = scanner.nextInt()
      U(i) = u
      V(i) = v
      g(u) += ((v, i))
      g(v) += ((u, i))
    }

    val dir = Array.fill(m)(0)
    val vis = Array.fill(n + 1)(false)
    val par = Array.fill(n + 1)(0)

    def setDir(id: Int, from: Int): Unit = {
      if (U(id) == from) dir(id) = 1
      else dir(id) = -1
    }

    var valid = true

    def dfs(u: Int, p: Int, pe: Int): Unit = {
      vis(u) = true
      for ((v, id) <- g(u)) {
        if (id == pe || dir(id) != 0) {}
        else if (!vis(v)) {
          dfs(v, u, id)
          if (par(v) == 1) {
            setDir(id, v)
            par(v) ^= 1
          } else {
            setDir(id, u)
            par(u) ^= 1
          }
        } else {
          setDir(id, u)
          par(u) ^= 1
        }
      }
    }

    for (s <- 1 to n if valid && !vis(s)) {
      dfs(s, -1, -1)
      if (par(s) % 2 != 0) {
        valid = false
      }
    }

    if (!valid) {
      println(-1)
    } else {
      for (i <- 0 until m) {
        if (dir(i) == 1) println(s"${U(i)} ${V(i)}")
        else println(s"${V(i)} ${U(i)}")
      }
    }
  }
}
