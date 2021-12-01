import kotlin.concurrent.thread

class Player5(
    _name:String
) {
    var name = _name
    //在用的时候进行初始化操作，惰性初始化
    val config by lazy { loadConfig() }

    //延迟加载
    lateinit var config2:String

    fun ready(){
        config2 = "ready"
    }

    fun shoot(){
        println(config2)
    }

    private fun loadConfig():String{
        println("loading")
        return "xxx"
    }
}


fun main() {
    val player = Player5("jack")
//    Thread.sleep(3000)
//    println(player.config)
//    player.ready()
    player.shoot()
}