fun main() {
    try{

  println("Enter your age:")
    var age = readLine()!!.toInt()
        if(age>=18) {
            println("Welcome!")
        }else{
            println("not 18 >< not old enough") }
    }catch (e: Exception){
        println("this is not number<_>")
}}