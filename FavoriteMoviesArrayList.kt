fun main() {
    val movearraylist = arrayListOf<String>()
    println("Pleas Type Your Favorite 3 movies:")
    print("The 1th Movie:")
    val m1= readLine()!!.toString()
    movearraylist.add(m1)
    print("The 2th Movie:")
    val m2= readLine()!!.toString()
    movearraylist.add(m2)
    print("The 3th Movie:")
    val m3= readLine()!!.toString()
    movearraylist.add(m3)

    /*for (item in movearraylist)
        println(item)*/
    println("Do you Want to Add more Movies (Y/N):")
    val yn= readLine()!!.toString()
    if(yn=="y")
    {
        print("The Movie:")
        val mm= readLine()!!.toString()
        movearraylist.add(mm)
    }
    for (item in movearraylist)
        println(item)
}