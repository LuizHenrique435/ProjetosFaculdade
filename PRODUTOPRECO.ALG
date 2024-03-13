Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2023
Var
// Seção de Declarações das variáveis 

produto: inteiro
quantidade: inteiro
valorp, valorf: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("MENU")
escreval("1.LASANHA ---- R$24,90")
escreval("2.ESCONDIDINHO DE CARNE ---- R$25,80")
escreval("3.CHURRASCO ---- R$49,99")
escreval("4.PEIXE A MILANESA ---- R$35,45")

escreval("ESCREVA O NÚMERO DO PRODUTO:")
leia(produto)
escreval("ESCREVA A QUANTIDADE:")
leia(quantidade)

escolha(produto)
caso 1
escreval("O valor a ser pago pela lasanha é" , quantidade*24.90)

caso 2
escreval("O valor a ser pago pelo escondidinho de carne é" , quantidade*25.80)

caso 3
escreval("O valor a ser pago pelo churrasco é" , quantidade*49.99)

caso 4
escreval("O valor a ser pago pelo peixe a milanesa é" , quantidade*35.45)

fimescolha


Fimalgoritmo