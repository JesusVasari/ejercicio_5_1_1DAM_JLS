open class armaFuego(
    private var nombre: String = "",
    protected var municion: Int = 0,
    protected var restar: Int = 1,
    private var tipoMunicion: String = "",
    private var daño: Int = 0,
    private var radio: String = "pequeño"
) {


    override fun toString(): String {
        return "$nombre, $municion, $tipoMunicion, $daño, $radio"
    }

    open fun recarga(): Int = municion + 6
    open fun dispara(): Int = restar
}

class Pistola(nombre: String, municion: Int,restar:Int, tipoMunicion: String, daño: Int,radio: String) : armaFuego(nombre, municion,restar, tipoMunicion, daño,radio) {

    override fun dispara():Int {
        municion -= restar * 1
        return municion
    }

}

class Rifle(nombre: String, municion: Int,restar:Int, tipoMunicion: String, daño: Int,radio: String) : armaFuego(nombre, municion,restar, tipoMunicion, daño,radio) {

    override fun dispara(): Int {
        municion -= restar * 2
        return municion
    }
}

class Bazooka(nombre: String, municion: Int,restar:Int, tipoMunicion: String, daño: Int,radio: String) :armaFuego(nombre, municion,restar, tipoMunicion, daño,radio) {

    override fun dispara():Int {
        municion -= restar * 3
        return municion
    }
}

fun main() {
  // funciona la instancia menos restar
    var p1: Pistola = Pistola("magnun",18,1,"44mm",50,"grande")
    p1.dispara()
    println(p1)


    var p2 :Rifle = Rifle("remington",15,0,"shoot",18,"grande")
    var p3: Bazooka = Bazooka("oefmn",11,0,"granada",100,"grande")

    var mapa :Map<K, out V>
    println()
}