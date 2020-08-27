import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("Nama :")
    reader.nextLine()
    print("Input Nilai : ")
    val inputNilai:Int = reader.nextInt()
    val hasil = if (inputNilai >= 90){
        "A"
    } else if (inputNilai in 80..90){
        "B"
    } else if (inputNilai >= 70){
        "C"
    } else if (inputNilai >= 60){
        "D"
    }else{
        "E"
    }
    print("Hasil : $hasil")
}