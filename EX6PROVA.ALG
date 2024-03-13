Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/04/2023
Var
// Seção de Declarações das variáveis 

letra1, letra2, letra3: caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("digite a primeira letra")
leia(letra1)
escreval("digite a segunda letra")
leia(letra2)

letra3<-letra1
letra1<-letra2
letra2<-letra3

escreval("a primeira letra agora é " ,letra1)
escreval("a segunda letra agora é " ,letra2)

Fimalgoritmo