print("SUPERPROGRAMA DAS GALAXIAS MATEMATICA DISCRETA")
print("OBS: para que P ^ Q = V, ambos os valores precisam ser = V")

while True:
    print("Considerando p e q, informe se são 'V' (verdadeiro) ou 'F' (falso): ")
    p = input("P: ").upper()
    q = input("Q: ").upper()

    if p == "V" and q == "V":
        print("P ^ Q = V")
    else:
        print("P ^ Q = F")

    encerrarPrograma = input("Pressione 'k' para finalizar ou qualquer outra tecla para voltar ao inicio: ")    

    if encerrarPrograma.lower() == "k":
        print("FINISH!")
        break
