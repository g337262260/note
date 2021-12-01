fun main() {
    //非空类型不能进行赋值
    //可空字符串类型
    var str:String? = "butterfly"
    //str = ""
    //安全调用操作符  ？
    //带let的安全调用    let：返回最后一行的结果
    str = str?.let {
        if (it.isNotBlank()){
            it.replaceFirstChar { it ->
                it.uppercase()
            }
        }else{
            "butterfly"
        }
    }
    //非空断言操作符
    str = null
//    println(str!!.replaceFirstChar())
    //空合并操作符  ?:
    println(str?:"jack")

    /**
     * 标准库函数
     * apply:可看作一个配置函数，配置完之后返回接收原对象
     * let:  1.使某个变量作用于其lambda表达式里，匿名函数执行完，返回lambda最后一行
     *       2.和空合并操作符一起使用
     * run:  1.run和apply相似，但不返回接收者，返回lambda的执行结果
     *       2.执行函数引用 :   "可看作一个配置函数，配置完之后返回接收原对象".run(::isLong) === true
     * with: 是run的变体，只不过传参的方式不太一样
     * also: 功能和let 相似，但是返回接收者对象
     * takeIf: 需要判断lambda提供的表达式结果来决定是否返回接收者对象
     * takeUnless:和takeIf相反
     */


}
fun isLong(name:String) = name.length >=10