print("SUPERPROGRAMA DAS GALAXIAS MATEMATICA DISCRETA")
while True:
    elementosA = input("Informe quaisquer elementos do conjunto A(OBS: separe-os por uma vírgula): ")
    elementosB = input("Informe quaisquer elementos do conjunto B(OBS: separe-os por uma vírgula): ")

    conjuntoA = elementosA.split(',')
    conjuntoB = elementosB.split(',')

    print("O conjunto A é: ", conjuntoA)
    print("O conjunto B é: ", conjuntoB)

    if set(conjuntoA).issubset(set(conjuntoB)):
        print("O conjunto A é um subconjunto de B.")
    else: 
        print("O conjunto A não é um subconjunto de B.")
    
    if set(conjuntoB).issubset(set(conjuntoA)):
        print("O conjunto B é um subconjunto de A.")
    else: 
        print("O conjunto B não é um subconjunto de A.")
        
    encerrarPrograma = input("Pressione 'k' para finalizar ou qualquer outra tecla para voltar ao inicio: ")    

    if encerrarPrograma.lower() == "k":
        print("FINISH!")
        break
