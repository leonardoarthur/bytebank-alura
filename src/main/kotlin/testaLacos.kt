fun testaLacos() {
    var i = 0
    while (i < 5) { //Enquanto i for menor que 5 execute esse comando:
        val titular: String = "Leo $i"
        val numeroConta: Int = 1000 + i
        var saldo = 0.0 + i//Double

        println("titular $titular")
        println("número da conta: $numeroConta")
        println("saldo da conta: $saldo")
        i++
    }
}
