class MagicBox7 <T:Human>(){

    //产生一个自定义类型的对象，如果不是指定的对象，就用过backup生成一个指定类型的对象
    //reified:方式泛型擦除,不能确定类型
    inline fun <reified T> randomOrBackup(backup:()->T):T{
        val items= listOf(Boy("Jack",20),Man("Danny",40))
        val random = items.shuffled().first()
        return if (random is T){
            random
        }else{
            backup()
        }
    }
}



open class Human(
    val age:Int
)

class Boy(private val name:String, age: Int) : Human(age){
    override fun toString(): String {
        return "Boy(name='$name')"
    }
}
class Man(val name:String,age: Int) : Human(age){
    override fun toString(): String {
        return "Man(name='$name')"
    }
}


fun main() {

    val box = MagicBox7<Man>()
    val subject = box.randomOrBackup {
        Man("jimmy", 18)
    }
    println(subject.toString())
}