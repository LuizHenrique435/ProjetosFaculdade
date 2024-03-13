Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2023
Var
// Seção de Declarações das variáveis 

peso:inteiro
sexo:caracter
imc, altura:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("informe seu peso")
leia(peso)
escreval("informe sua altura")
leia(altura)

imc<- peso/(altura*altura)

escreval("informe seu sexo")
leia(sexo)

SE(sexo="F")entao
SE(imc >=18)e (imc<=24)entao
escreval("peso normal")
senao
SE(imc >=25)e (imc<=30)entao
escreval("sobrepeso")
senao
SE(imc >=31)e (imc<=40)entao
escreval("Obesidade moderada")
senao
SE(imc >40)entao
escreval("Obesidade Gravissima")
fimse
fimse
fimse
fimse
fimse
SE(sexo="M")entao
SE(imc >=18)e (imc<=25)entao
escreval("peso normal")
senao
SE(imc >=25)e (imc<=30)entao
escreval("sobrepeso")
senao
SE(imc >=31)e (imc<=40)entao
escreval("Obesidade moderada")
senao
SE(imc >40)entao
escreval("Obesidade Gravissima")
fimse
fimse
fimse
fimse
fimse
Fimalgoritmo