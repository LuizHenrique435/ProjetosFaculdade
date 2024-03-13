Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2023
Var
// Seção de Declarações das variáveis

categoria:caracter
salarioAT, salarioNO:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

escreval("Qual sua categoria dentro da empresa?")
leia(categoria)

escreval("Qual seu salario atual?")
leia(salarioAT)

SE(categoria = "VENDEDOR")entao
salarioNO<- salarioAT+(salarioAT*0.1)
escreval("Com base na sua categoria de " , categoria , " seu salario novo é " , salarioNO)
SENAO
SE(categoria = "GERENTE")entao
salarioNO<- salarioAT+(salarioAT*0.13)
escreval("Com base na sua categoria de " , categoria , " seu salario novo é " , salarioNO)
SENAO
salarioNO<- salarioAT+(salarioAT*0.15)
escreval("Com base na sua categoria de " , categoria , " seu salario novo é " , salarioNO)
FIMSE
FIMSE


Fimalgoritmo