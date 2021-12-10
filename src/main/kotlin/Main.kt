open class armaFuego(municion: Int) {
    private var nombre: String=""
    private var municion: Int = 0
    private var tipoMunicion: String=""
    private var danyo: Int = 0
    private var radio = String

    override fun toString(): String {
        return  "$nombre, $municion, $tipoMunicion, $danyo, $radio"
    }

    open fun recarga() = municion
    open fun dispara() = municion
}

class Pistola(municion:Int) : armaFuego(municion) {

    final override fun dispara(): Int = -1


}
class Rifle(municion: Int) : armaFuego(municion) {

    final override fun dispara(): Int = -2
}
class bazooka(municion: Int) : armaFuego(municion) {

    final override fun dispara(): Int = -3
}
fun main() {

    var p1 : Pistola = Pistola(20)
    p1.dispara()

    println(p1)

    var p2 :Rifle = Rifle(30)
}