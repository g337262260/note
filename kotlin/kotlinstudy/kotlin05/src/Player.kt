import kotlin.math.absoluteValue

fun main() {
    var p = Player("jack",  _isNormal = true)

}
//类初始化顺序：主构造 > 类级别  > init > 次构造
//主构造函数
class Player(
    _name: String,    //临时变量推荐用下划线
    var age: Int = 20,     //主构造函数里定义属性
    _isNormal: Boolean
) {
    //初始化块：在构造类的实例时执行
    init {
        require(age>0){
            "异常信息"
        }
    }
    //次构造函数初始化属性
    constructor(name:String):this(name,age = 10,_isNormal = false){
        this.name = name.toUpperCase()
    }

    var name: String = _name
        get() = field.capitalize();
        set(value) {
            field = value.trim()
        }

    var isNormal = _isNormal



}