fun main() {
    testaComportamentosConta()

    testaCopiasEReferencias()

    val leo = Funcionario("Leo", "2222222222", 100.0)

    println(leo.cpf)
    println(leo.salario)
    println("A bonificação que leo vai receber é de ${leo.bonificacao()}" )
}