enum class Type(var _type: Int) {
    BIG(1),
    MIDDLE(2),
    SMALL(3);
}

class Car(var t: Type){
    fun showType():String{
        return when(t){
            Type.BIG -> "BIG CAR ${this.t._type}"
            Type.MIDDLE -> "MIDDLE CAR ${this.t._type}"
            Type.SMALL -> "SAMLL CAR ${this.t._type}"
        }
    }
}

fun main() {
    println(Car(Type.MIDDLE).showType())
}