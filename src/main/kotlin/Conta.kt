//Primeira letra da CLASSE é maiuscula!
//Classe é um molde, voce coloca ele e preenche com algo, um molde que pode ser usado varias vzs.
class Conta(var titular: String, val numero: Int, opcional: Int = 0) {
    var saldo = 100.0 //Modificador de acesso, o padrão é Public
        private set // Properties, mais idiomatico ao Kotlin.


    //Como seria com um construtor "secundario", mas podemos usar um primario na propria classe.
//    constructor(titular: String, numero: Double){
//        this.titular = titular
//        this.numero = numero
//
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor  // O THIS subistitui o CONTA, pois o THIS fala "NESSE OBJETO QUE ESTOU AGORA".
        }

    }

    //A FUN deposita foi para dentro da classe pois: As classes são as responsáveis por modificar seus atributos.
    // qualquer comportamento que ajuste o estado da classe (modifique os atributos), deve ser implementado pela própria classe.
    fun sacar(valor: Double) {
        if (saldo > valor) {
            this.saldo -= valor  // Mais uma vez o THIS fazedno referencia ao OBJETO em que a FUN está no momento.
        } else {
            println("Infelizmente o valor digitado não está disponivel no sue saldo.")
        }
    }

    fun tranferencia(valor: Double, destino: Conta) {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        } else {
            println("Não é possivel realizar a transferencia! Saldo insuficiente.")
        }
    }

    // Isso é encapsulamento, deixamos a variavel protegida e criamos uma copia segura dela para usar.
//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = valor
//        }
//    }
//}


}