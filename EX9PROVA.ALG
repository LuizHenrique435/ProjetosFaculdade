Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2023
Var
// Seção de Declarações das variáveis 

n1, n2: INTEIRO
operacao: CARACTER

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("OLÁ TROPA")
escreval("---------")
escreval("CALCULADORA EXTRATERRESTRE")
escreval("---------")
escreval("DIGITE UMA OPERAÇÃO EX: + - \ *")
leia(operacao)
escreval("DIGITE UM NUMERO")
leia(n1)
escreval("DIGITE UM NUMERO")
leia(n2)

escolha(operacao)
caso "+"
escreval("A SOMA DOS NUMEROS É " ,n1+n2)

caso "-"
escreval("A SUBTRAÇÃO DOS NUMEROS É " ,n1-n2)

caso "/"
escreval("A DIVISÃO DOS NUMEROS É " ,n1/n2)

caso "*"
escreval("A MULTIPLICAÇÃO DOS NUMEROS É " ,n1*n2)


FIMESCOLHA


Fimalgoritmo