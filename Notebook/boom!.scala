def boom(x: Int): Int =
    if x == 0 then throw new Exception("boom!")
    else boom(x - 1) + 1

@main def m() = 
    boom(0)