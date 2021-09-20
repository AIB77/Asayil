fun main() {

    val countryarray = arrayListOf<String>("The Counties are: 1-Kingdom of Saudi Arabia","2-United Arab Emirates","3-Kingdom of Bahrain")
    println(countryarray)
    val captionarray= arrayListOf<String>()

    for (count in 1..3)
    {

        print("what is the Caption of this County $count: ")
        val capitalyname= readLine()!!.toString()
        captionarray.add(capitalyname)

    }

    for (i in countryarray )
    {

        println("The Country is $i and The Capital is ")
    }

}