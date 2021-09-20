fun main() {
    val arraycountry = ArrayList<ArrayList<String>>()
    for (count in 1..3)
    {
        print("$count Enter The Name of Country: ")
        val countryname= readLine()!!.toString()
        print("$count Enter The Name of Capital: ")
        val capitalyname= readLine()!!.toString()
        arraycountry.add(ArrayList(arrayListOf(countryname,capitalyname)))

    }
    for (i in arraycountry)
    {
        println("The Country is ${i[1]} and The Capital is ${i[0]}")
    }

}