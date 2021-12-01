//1.object 对象的声明
object SingletonTest {
    init {
        println("ApplicationConfig loading ...")
    }
    fun doSomething(){
        println("do something")
    }
}



fun main() {
    SingletonTest.doSomething()
}