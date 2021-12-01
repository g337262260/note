//扩展函数
fun String.addExt(amount:Int = 1) =  this+"!".repeat(amount)

//infix 关键字
infix fun String?.printWithDefault(default: String) = println(this?:default)

//扩展属性
val  String.newVowels
    get() = "this is $this"

fun Any.easyPrint() = println(this)

//泛型类型扩展函数
fun <T> T.easyPrint():T{
    println(this)
    return this
}

fun main() {
    println("This is".addExt(3).easyPrint())
    println("This is".easyPrint())

    println("dog".newVowels)

    val nullableString:String?= null
    val s = "this".apply {

    }
    "this".map {

    }

}