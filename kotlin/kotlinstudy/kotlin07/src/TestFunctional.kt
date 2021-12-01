/**
 * map:处理集合
 * flatMap:处理集合中的集合
 *
 */
fun main() {
    val animals = listOf(listOf(Animal("dog")),listOf(Animal("pig")),listOf(Animal("cat")))
//    val list = animals.
//    map { it ->
//        "Animal:$it"
//    }.map {
//        Animal(it)
//    }
    var flatmap = animals.flatMap {
        it
    }
    println(flatmap)

    //zip:合并
    //fold:数量累加
    var value = listOf(1, 2, 3, 4).fold(0) { acc, i ->
        acc + (i * 3)
    }
    println(value)

}


class Animal(private var name:String){

    override fun toString(): String {
        return "Animal(name='$name')"
    }
}