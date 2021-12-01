fun main() {
    val list = listOf("Jason","Jack","Jacky")

    //可变列表
    val mutableList = mutableListOf("Jason", "Jack", "Jacky")
    //mutator函数：修改可变列表的函数统称
    mutableList += "Tom"

    mutableList.forEachIndexed { index, name ->
        println("$index,$name")
    }
    //解构
    val (origin:String,_:kotlin.String,_:kotlin.String,lastOne:String) = mutableList
    //println(mutableList.getOrElse(3){"UNKOWN"})
    //println("$origin,$lastOne")

    //可变Set MutableSet
    //Map


}