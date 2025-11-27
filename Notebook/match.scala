@main def matcharg(args: String) =
    val firstArg = 
        if !args.isEmpty then
            args(0)
        else ""

    val friend =
        args match
            case "salt" => "s"
            case "chips" => "c"
            case "eggs" => "e"
            case _ => "huh?"

    println(friend)
        

    
