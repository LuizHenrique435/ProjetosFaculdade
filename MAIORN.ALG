Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2023
Var
// Seção de Declarações das variáveis 
 n1, n2, maior: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   escreval("numero")
   leia(n1)
   escreval("numero")
   leia(n2)
   
   SE(n1>n2)entao
   maior<-n1
   SENAO
   maior<-n2
   FIMSE
   
   escreval("O maior numero é o " , maior)
   
Fimalgoritmo