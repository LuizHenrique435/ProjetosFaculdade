Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2023
Var
// Seção de Declarações das variáveis 
hora:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("qual o horario?")
leia(hora)

se(hora >=1) e (hora <=11)entao
escreval("bom dia")
senao
se(hora>=12) e (hora<=18)entao
escreval("boa tarde")
senao
escreval("boa noite")
fimse
fimse

Fimalgoritmo