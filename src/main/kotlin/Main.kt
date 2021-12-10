open class armaFuego() {
    private var nombre: String
    private var municion: Int = 50
    private var tipoMunicion: String
    private var danyo: Int = 0
    private var radio = String

    override fun toString(): String {
        return  "$nombre, $municion, $tipoMunicion, $danyo, $radio"
    }

    open fun recarga() = municion
    open fun dispara() = municion
}

class Pistola : armaFuego

fun dispara() = municion--

class Rifle : armaFuego

fun dispara() = municion - 2

class bazooka : armaFuego

fun dispara() = municion - 3

fun main(args: Array<String>) {

    var p1 : Pistola
    p1.dispara("")

    println(p1)
}