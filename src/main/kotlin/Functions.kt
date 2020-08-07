fun main() {
    val user = setUser("M.CHAIRUL ANAM", 15, "Game" )
    println(user)
}
fun setUser(name: String, age: Int, hobby: String){
    println("My name is $name, I like $hobby, and I'm $age years old")
}