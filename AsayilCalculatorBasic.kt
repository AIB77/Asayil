fun main() {

    while(true)
    {

        print("Would you like to add numbers? (Y/N) >>")
        val user = readLine()!!.toString()
        if(user =="y")
        {
            print("Enter your first number:")
            val num1 = readLine()!!.toIntOrNull()
            print("Enter your second number:")
            val num2 = readLine()!!.toIntOrNull()
            val result = num2?.let { num1?.plus(it) }
            println("$num1 + $num2 = $result")

        }else if(user == "n"){
            break
        }



    }





}