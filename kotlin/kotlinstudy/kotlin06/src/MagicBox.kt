//泛型类
//vararg :可变参数
//out 协变：只将泛型类型作为函数返回   子类泛型对象赋值给父类泛型对象
//in 逆变：泛型类只将泛型类型作为函数的入参
//invariant 不变：既in又out
class MagicBox<T>( vararg item:T) {
    private var subject: Array<out T> = item
    var available = false
    fun showItem(){
        println(subject)
    }

    //泛型函数
    fun showItem2(index:Int): T? {
        return subject[index].takeIf { available }
    }
    //return ->R
    //参数接收一个匿名函数 实现T->R
    fun <R> showItem2(index: Int,subjectFunction: (T)->R):R?{
        return subjectFunction(subject[index])
    }






}

class Men(var name:String){
    fun showName(){
        println("His name is $name")
    }

    fun generateMen(name: String):Men{
        return Men(name)
    }
}


fun main() {
    MagicBox<String>("jack").showItem()
    val jaeey = MagicBox<String>("peter","JAY","LBJ")
    jaeey.available = true
    println(jaeey.showItem2(2))
    jaeey.showItem2(1) {
        Men(it).generateMen("shit")
    }?.showName()


}