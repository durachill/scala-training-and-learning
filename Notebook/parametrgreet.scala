@main def main() =
    val greetstrings = new Array[String](3)
    greetstrings(0) = "Hello"
    greetstrings(1) = ", "
    greetstrings(2) = "world!"

    for i <- greetstrings do
        print(i)



