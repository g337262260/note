data class Coordinate(
    var x:Int,
    var y :Int,
) {
    val isInBounds = x>0 && y>0
    //运算符重载
    operator fun plus(other:Coordinate)  = Coordinate(x+other.x,y+other.y)
}

class PlayerScore(
    private val experience:Int,
    private val level:Int,
    private val name:String,
){
    //非data类结构操作
    operator fun component1() = experience
    operator fun component2() = level
    operator fun component3() = name
}

fun main() {
    //copy函数
    println(Coordinate(20,20).copy(x = 10, y = 10))
    //类的解构  数据类自带解构语法
    val (x,y) = Coordinate(20,10)
    println("$x,$y")
    val (e,l,name) = PlayerScore(10,20,"jack")
    println("$e,$l,$name")
    println("-----------运算符重载-------------")
    println(Coordinate(20,20)+Coordinate(10,10))
}