fun main() {
    val moviearray = arrayOf(" ", " ", " ", " ", " ")

    print("Enter a name of movie 1th:")
    var m1 = readLine()!!.toString()
    moviearray[0] = "$m1"
    print("Enter a name of movie 2th:")
    var m2 = readLine()!!.toString()
    moviearray[1] = "$m2"
    print("Enter a name of movie 3th:")
    var m3 = readLine()!!.toString()
    moviearray[2] = "$m3"
    print("Enter a name of movie 4th:")
    var m4 = readLine()!!.toString()
    moviearray[3] = "$m4"
    print("Enter a name of movie 5th:")
    var m5 = readLine()!!.toString()
    moviearray[4] = "$m5"


    println("your Top 5 Movies are:")
    for (item in moviearray)
        println(item)

}

