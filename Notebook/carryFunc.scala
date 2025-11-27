//Определение и вызов обычной функции
def plainOldSum(x: Int, y: Int) = x + y
//plainOldSum(1, 2) // 3

//Определение и вызов каррированной функции

def curriedSum(x: Int)(y: Int) = x + y
//curriedSum(1)(2) // 3

@main def m() = 
    println(curriedSum(1)(2))