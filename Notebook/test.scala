@main def m() =
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    for i <- jetSet do
        print(i)

