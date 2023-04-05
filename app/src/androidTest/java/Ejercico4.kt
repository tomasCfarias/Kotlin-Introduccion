fun main(){
    val nros:ArrayList<Int> = arrayListOf(10, 2, 5, 8, 9, 6, 4, 7, 9, 3)

    var x:Int
    var par = 0
    var impar =0
    for (x in nros){
        if (x%2 == 0){
            par +=1
        }
        else{
            impar +=1
        }
    }
    print("Los numeros pares son $par y los impares son $impar")
}