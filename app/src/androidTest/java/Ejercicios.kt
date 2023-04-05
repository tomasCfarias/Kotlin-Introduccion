fun main(){
    var nro1= readln().toInt()
    var nro2= readln().toInt()
    mayor(nro1, nro2)
}

fun mayor(nro1:Int, nro2:Int){
    if (nro1 < nro2){
        println("El numero mayor es $nro2")
    }
    else{
        println("El numero mayor es $nro1")
    }
}