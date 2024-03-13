Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/04/2023
Var
// Seção de Declarações das variáveis 

n1, n2, n3, n4, freq:inteiro
media:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("informe sua frequencia escolar")
leia(freq)

se(freq<=75)entao
escreval("ALUNO REPROVADO POR FREQUENCIA ABAIXO")
senao

escreval("informe sua nota 1")
leia(n1)

escreval("informe sua nota 2")
leia(n2)

escreval("informe sua nota 3")
leia(n3)

escreval("informe sua nota 4")
leia(n4)

media<- (n1+n2+n3+n4)/4

se(media>=7)entao
escreval("SUA MÉDIA É: " , media , " ALUNO APROVADO")
senao
se(media>=5)entao
escreval("SUA MÉDIA É: " , media , " RECUPERAÇÃO")
senao
escreval("ALUNO RETIDO POR FALTA DE MÉDIA")
fimse
fimse
fimse
Fimalgoritmo