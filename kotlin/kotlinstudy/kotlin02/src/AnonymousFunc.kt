fun main() {

    //匿名函数
    val blessingFunction:()->String = {
        val holiday = "New Year"
        "Happy $holiday"
    }

    val blessingFunction2:(String)->String = { name->
        "Happy $name"
    }

    val blessingFunction3 = {
        val holiday = "New Year"
        "Happy $holiday"
    }
    //类型推断
    val blessingFunction4 = {name:String,age:Int ->
        "$name ,$age"
    }

    println(blessingFunction.invoke())
    println(blessingFunction2.invoke("New Year2"))
    println(blessingFunction3.invoke())
    println(blessingFunction4("jack",4))

    val getDiscountWords = {goodsName:String,hour:Int ->
        val currentYear = 2017;
        "${currentYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }

    showOnBoard("卫生纸",getDiscountWords)
    //简写写法
    showOnBoard("水杯"){goodsName:String,hour:Int ->
        val currentYear = 2017;
        "${currentYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }
    println(configDiscountWords().invoke("沐浴露"))

}

//函数类型作为返回类型
//闭包：匿名函数能修改并引用定义再自身作用域外的变量，匿名函数引用着定义自身函数里的变量   Kotlin的lambda就是闭包
fun  configDiscountWords():(String)->String{
    val currentYear = 2017;
    val hour = (1..24).shuffled().last()
    return { goodsName:String ->
        "${currentYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }
}

fun showOnBoard(goodsName:String,getDiscountWords:(String,Int)->String){
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName,hour))
}