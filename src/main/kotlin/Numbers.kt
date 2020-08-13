fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double
    //to do
    val panjang2 = panjang.toInt()
    val p = panjang2.toDouble()
    val l = lebar
    val t = tinggi.toDouble()
    val user = hitungVolume(p, l, t)

}
fun hitungVolume(p : Double, l : Double, t : Double) : Float
{
    val v = p * l * t
    //to do
    val p = p.toInt()
    val t = t.toInt()
    val volume = v.toFloat()
    print("Volume dari balok yang mempunyai panjang $p, lebar $l, dan tinggi $t, ini adalah $volume")
    return volume
}