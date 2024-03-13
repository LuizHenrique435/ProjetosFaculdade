Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2023
Var
// Seção de Declarações das variáveis 
diasI, diasP, diasEs:inteiro
mes:caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("Informe em qual mês estamos")
leia(mes)

diasI<-31
diasP<-30
diasEs<-28

escolha(mes)
caso "janeiro" , "março", "maio", "julho", "agosto", "outubro", "dezembro"
escreval("O mês que estamos tem " , diasI , " dias")
caso "fevereiro"
escreval("O mês que estamos tem " , diasEs, " dias")
caso "abril" , "junho", "setembro", "novembro"
escreval("O mês que estamos tem" , diasP , " dias")

fimescolha
Fimalgoritmo