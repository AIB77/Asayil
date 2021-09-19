import kotlin.random.Random

fun main() {
    try{

            println("Enter First Number:")
        var num1= readLine()!!.toInt()
            println("Enter Second Number:")
        var num2= readLine()!!.toInt()
        var num3= Random.nextInt(0,10)
        var res=num1*num3+num2
        println("$num1 * x + $num2 = $res")
        print("What is X? ")
        var num4= readLine()!!.toInt()
        if(num4==num3)
        {
            println("you got it!")
        }
        else {
            println("it is not correct")
        }

    }catch (e: Exception){
        println("please enter number only")


    }
}