print("SUPERPROGRAMA DAS GALAXIAS MATEMATICA DISCRETA")

while True:
    elementos = input("Informe os elementos do conjunto(obs: adicione virgulas entre os elementos): ")
    
    conjunto = set(elementos.split(","))
    cardinalidade = len(conjunto)
    
    print("O conjunto informado possui a cardinalidade =", cardinalidade)
            
    encerrarPrograma = input("Pressione 'k' para finalizar ou qualquer outra tecla para voltar ao inicio: ")    

    if encerrarPrograma.lower() == "k":
        print("FINISH!")
        break
