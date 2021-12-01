interface InterfaceTest {
    val maxSpeed:Int
        get() = (1..500).shuffled().last()
    var wheels:Int
    fun move():String
}

class Car(var _name:String, override var wheels: Int=4):InterfaceTest{
    override var maxSpeed: Int
        get() = super.maxSpeed    //父类的实现
        set(value) {}

    override fun move(): String {
        return "$_name,$wheels,$maxSpeed"
    }
}

fun main() {


    println(Car("BMW").move())
}