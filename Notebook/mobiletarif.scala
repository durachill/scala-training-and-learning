import java.util.Scanner

object Main {
    val in = new Scanner(System.in)
    def main(args: Array[String]): Unit = {
        val A = in.nextInt()
        val B = in.nextInt()
        val C = in.nextInt()
        val D = in.nextInt()
        if (D < B) then
            System.out.print(A)

        else 
            System.out.print(A + (C * (D - B)))
    }
        
}