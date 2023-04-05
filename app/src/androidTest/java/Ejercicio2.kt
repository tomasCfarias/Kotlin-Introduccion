fun main(){
    println("Ingrese los numeros")
    var nro1 = readln().toInt()
    var nro2 = readln().toInt()
    val resultado = suma(nro1,nro2).toFloat()
    val myStr = String.format("$%.2f", resultado)
    print(myStr)
}

fun suma(nro1: Int, nro2 : Int):Int{

    var total = nro1 + nro2

    return total
}