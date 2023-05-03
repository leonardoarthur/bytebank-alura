fun testaComportamentosConta() {
    println("Bem vindo ao Bytebank")
    val contaLeo = Conta(titular = "Leo", numero = 10)


    val contaCarla = Conta(
        numero = 12,
        titular = "Carla"
    ) //Labels são esses "parametros", ao invés de deixer a IDE colocar você pode colocar na sua ordem
    var contaLiza = contaCarla
    contaLiza.titular = "Liza"
    contaLiza.deposita(854.0)

    println(contaCarla)
    println(contaLiza)  //Vai dar o mesmo valor HEX pois uma está ligada a outra, dando o mesmo resultado.
    println(contaLiza.saldo)
    println(contaLiza.titular)
    println(contaCarla.titular)
    println(contaCarla.saldo)

    println("Depositando na conta da Carla:")
    contaCarla.deposita(65.0)
    println(contaCarla.saldo)

    println("Saque de 10 reais da conta:")
    contaCarla.sacar(10.0)
    println(contaCarla.saldo)

    println("Saque de 1000 reais (Não tem na conta)")
    contaCarla.sacar(1000.0)
    println(contaCarla.saldo)

    println("Valores em saldo das contas Leo e Carla")
    println(contaLeo.saldo)
    println(contaCarla.saldo)

    println("Transferência entre contas:")
    contaCarla.tranferencia(100.00, contaLeo)
    println(contaCarla.saldo)
    println(contaLeo.saldo)
}
