import kotlin.random.Random

fun main() {
    try{
        var i=0
        while (i<3) {
            i++
            println("IT is numbers guessing game.The goal is to guess a number between 0 and 10")
            println("So, guess a number between 0 and 10:")

            var num1 = Random.nextInt(0, 10)
            var num2 = readLine()!!.toInt()
            when {
                num1 == num2 -> println("it is true")
                else -> println("it is not true")

            }
            println("type (quite) to stop or (no) to continue")
            val userinput= readLine()
            if(userinput=="quite")
            {
                println("program terminated")
                break
            }

        }


    }catch (e: Exception){
        println("please enter number only")


    }
}