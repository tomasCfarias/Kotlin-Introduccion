fun main(){
    val persona1 = persona()
    persona1.nombre = readln()
    persona1.edad = readln().toInt()

    println("Nombre: ${persona1.nombre}")
    println("Edad: ${persona1.edad}")

    val persona2 = persona()
    persona2.nombre = readln()
    persona2.edad = readln().toInt()

    println("Nombre: ${persona2.nombre}")
    println("Edad: ${persona2.edad}")

}

// no se si el usuario pone la edad y el nombre asi que le puse un readln
// no entendi muy bien los getters y setters

class persona{
    var nombre : String = ""
    var edad :Int = 0

    get() {
        return field
    }




}