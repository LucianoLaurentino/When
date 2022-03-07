fun main(args: Array<String>) {
    NatalidadeMortalidade()
    pagamento()
}

fun NatalidadeMortalidade(): Unit {
    println("Digite a taxa de nascimentos:")
    var nascidos = readLine()!!.toInt()
    println("Digite a taxa de óbitos:")
    var numeroDeObitos = readLine()!!.toInt()
    println("Digite o número de habitantes:")
    var numeroDeHabitantes = readLine()!!.toInt()
    println("Escolha alguma opção: \n1 - Taxa de mortalidade \n2 - Taxa de natalidade")
    when (readLine()!!.toInt()) {
        1 -> println("Opção escolhida: Taxa de mortalidade: ${(numeroDeObitos * 1000) / numeroDeHabitantes}")
        2 -> println("Opção escolhida: Taxa de natalidade: ${(nascidos * 1000) / numeroDeHabitantes}")
        else -> println("Opção Invalida!")
    }
}

fun pagamento(): Unit {
    println("Informe o valor do produto: ")
    val valorVenda = readLine()!!.toFloat()
    println("Escolha alguma opção: \n1 - À vista\n2 - À prazo\n3 - À prazo parcelado")
    when (readLine()!!.toDouble()) {
        1.0 -> println("Opção escolhida: À vista \nValor Total: ${valorVenda - (valorVenda * 15 / 100)}")
        2.0 -> println("Opção escolhida: À prazo (30 dias) \nValor Total: ${valorVenda + (valorVenda * 3 / 100)}")
        3.0 -> println("Opção escolhida: À prazo parcelado \nValor Total: ${valorVenda + (valorVenda * 1.5 / 100)}")
        else -> println("Opção Invalida!")
    }
}