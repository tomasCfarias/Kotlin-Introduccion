fun main(){
    println("Ingrese Palabra")
    var palabra = readln()
    println(caracteres(palabra))

    println("Ingrese 2 nombres")
    var nombre1 = readln()
    var nombre2 = readln()

    if (caracteres(nombre1) > caracteres(nombre2)){
        println("El nombre con mas caracteres es $nombre1")
    }
    else{
        println("El nombre con mas caracteres es $nombre2")
    }
}

fun caracteres(palabra:String):String{

    val longitud:String = palabra.length.toString()

    return  longitud
}