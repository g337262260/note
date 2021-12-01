//枚举类型
enum class Direction(private var coordinate: Coordinate) {
    EAST(coordinate = Coordinate(10,0)),
    WEST(coordinate = Coordinate(10,2)),
    SOUTH(coordinate = Coordinate(10,4)),
    NORTH(coordinate = Coordinate(10,8));
    //枚举类型内定义函数
    fun update(coordinate1: Coordinate) = Coordinate(coordinate.x+coordinate1.x,coordinate.y+coordinate1.y)
}

fun main() {
    println(Direction.EAST.update(Coordinate(-1,3)))
}