print("SUPERPROGRAMA DAS GALAXIAS MATEMATICA DISCRETA")
print("OBS: para que P v Q = V, pelo menos 1 dos valores precisa ser = V.")

while True:
    print("Considerando p e q, informe se são 'V' (verdadeiro) ou 'F' (falso): ")
    p = input("P: ").upper()  # Convertendo a entrada para maiúsculas
    q = input("Q: ").upper()  # Convertendo a entrada para maiúsculas

    if p == "V" or q == "V":
        print("P v Q = V")
    else:
        print("P v Q = F")

    encerrarPrograma = input("Pressione 'k' para finalizar ou qualquer outra tecla e volte ao inicio: ")

    if encerrarPrograma == "k":
        print("Finish!")
        break
        
