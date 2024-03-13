Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2023
Var
// Seção de Declarações das variáveis 

n1,n2, maior:INTEIRO

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   ESCREVAL("Digite um numero")
   leia(n1)

   ESCREVAL("Digite um numero")
   leia(n2)
   
    SE(n1=n2)entao
    escreval("numeros iguais")
    SENAO
    SE(n1>n2)entao
    maior <- n1
    escreval("O maior numero é " , maior)
    SENAO
    maior <- n2
    escreval("O maior numero é " , maior)
    FIMSE
    FIMSE

Fimalgoritmo