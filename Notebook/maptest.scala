@main def vecMap() = 
    val ques = Vector ("Who", "WHAT", "When", "Where", "Why")

    val usingMap = ques.map(q => q.toLowerCase + "?")

    // Снизу код, аналогичный map

    val usingForYield =
        for q <- ques yield
            q.toLowerCase + "?"

    println(usingMap)
    println(usingForYield)
