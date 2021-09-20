fun main() {
    print("Enter First number:")
    val num1 = readLine()!!.toInt()
    print("Enter second number:")
    val num2 = readLine()!!.toInt()
    print("Enter operation * , + , / , -:")
    val oper= readLine()!!.toString()
    if(oper=="*")
    {
        val result=num1 * num2
        println("$num1 * $num2 =$result")
    }
    if(oper=="+")
    {
        val result=num1+num2
        println("$num1 + $num2 =$result")
    }
    if(oper=="-")
    {
        val result=num1-num2
        println("$num1 - $num2 =$result")
    }
    if(oper=="/")
    {
        if(num2==0)
        {
           print("you cannot divide by 0")
        }
        else {
            val result=num1 / num2
        println("$num1 / $num2 =$result")}
    }


}