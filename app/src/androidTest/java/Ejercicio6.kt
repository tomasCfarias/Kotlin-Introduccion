fun main(){
    var x:Int
    var nrosLista: ArrayList<Int> = arrayListOf()

    //no se si el usuario tiene que elegir cuantas veces se repite o lo tengo que poner yo
    repeat(5){
        println("Agregue a la lista")
        x = readln().toInt()
        nrosLista.add(x)
    }
    println(nrosLista)
    print(mayorDeLaLista(nrosLista))


}

fun mayorDeLaLista(nros:ArrayList<Int>):Int{
    return nros.max()
}