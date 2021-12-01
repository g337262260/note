import java.io.File

//数据类
//对象表达式
open class Player2 {
    open fun load() = "Player load"

    //伴生对象
    companion object{
        private const val PATH = "XXXX"
        fun load() = File(PATH).readBytes()
    }
    //嵌套类
    class Equipment(var name:String){
        fun show()= println("equipment:$name")
    }

}

fun main() {
    val  player = object :Player2(){
        override fun load(): String {
            return "anonymous load"
        }
    }
    println(player.load())
//    Player2.load()
    val equipment = Player2.Equipment("knife")
    equipment.show()
}

//