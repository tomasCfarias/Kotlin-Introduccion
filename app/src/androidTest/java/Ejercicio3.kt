fun main(){
    println("Ingrese valor del lado")
    var lado = readln().toInt()
    val superf = superficie(lado)
    print("El valor de la superficie es $superf")

}

fun superficie(lado:Int): Int{
    val superficie = lado*4
    return superficie
}