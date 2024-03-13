Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2023
Var
// Seção de Declarações das variáveis 

   nome: CARACTER
   n1, n2, n3, media: REAL

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   escreval("Qual seu nome?")
   leia(nome)
   escreval("qual a nota 1")
   leia(n1)
   escreval("qual a nota 2")
   leia(n2)
   escreval("qual a nota 3")
   leia(n3)
   
   media<-((n1+n2+n3)/3)
   
   escreval("SUA MÉDIA É " , media)
   
   SE(media>=7)entao
   escreval("APROVADO")
   SENAO
   SE(media<5)entao
   escreval("REPROVADO")
   SENAO
   escreval("RECUPERAÇÃO")
   FIMSE
   FIMSE

Fimalgoritmo