print("SUPERPROGRAMA DAS GALAXIAS MATEMATICA DISCRETA")
print("CONDICIONAL")

while True:
    print("Considerando p e q, informe se são 'V' (verdadeiro) ou 'F' (falso): ")
    p = input("P: ").upper()
    q = input("Q: ").upper()

    if p == "V" and q == "F":
        print("P -> Q = F")
    else:
        print("P -> Q = V")

    encerrarPrograma = input("Pressione 'k' para finalizar ou qualquer outra tecla para voltar ao inicio: ")    

    if encerrarPrograma.lower() == "k":
        print("FINISH!")
        break
