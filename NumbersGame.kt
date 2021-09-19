fun main() {
    try{

    println("IT is numbers guessing game.The goal is to guess a number between 0 and 10")
        println("So, guess a number between 0 and 10:")
        var num = readLine()!!.toInt()
        if(num==5)
        {
            println("you got it!")
            println("Game Over")
        }
        else{
            println("Wrong number. the number was 5")
            println("Game Over")
        }

    }catch (e: Exception){
        println("please enter number only")
        println("Game Over")

}}