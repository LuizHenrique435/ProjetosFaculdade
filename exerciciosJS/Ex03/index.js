function calcularFrete() {
    var distancia = parseFloat(document.getElementById("distancia").value);
    var quantidadePecas = parseInt(document.getElementById("quantidadePecas").value);
    var regiao = parseInt(document.getElementById("regiao").value);
    var desejaRastreamento = document.getElementById("rastreamento").value.toUpperCase();

    // Variáveis para armazenar os valores do frete
    var valorFretePorPeca = 0;
    var valorFreteTotal = 0;
    var valorRastreamento = 0;
    var valorFretePorQuilometro = distancia;

    // Cálculo do frete por peça
    if (quantidadePecas <= 1000) {
        if (regiao === 1) {
            valorFretePorPeca = 1.00;
        } else if (regiao === 2) {
            valorFretePorPeca = 1.20;
        } else if (regiao === 3) {
            valorFretePorPeca = 1.30;
        }
    } else {
        if (regiao === 1) {
            valorFretePorPeca = 1.00 * (1 - 0.10); // 10% de desconto
        } else if (regiao === 2) {
            valorFretePorPeca = 1.20 * (1 - 0.12); // 12% de desconto
        } else if (regiao === 3) {
            valorFretePorPeca = 1.30 * (1 - 0.13); // 13% de desconto
        }
    }

    // Cálculo do valor do rastreamento
    if (desejaRastreamento === "S") {
        valorRastreamento = 200.00;
    }

    // Cálculo do valor total do frete
    valorFreteTotal = quantidadePecas * valorFretePorPeca;

    // Exibição dos resultados
    document.getElementById("resultadoRastreamento").innerHTML = "Taxa do rastreamento: R$ " + valorRastreamento.toFixed(2);
    document.getElementById("resultadoFretePecas").innerHTML = "Valor do frete pelas peças: R$ " + valorFreteTotal.toFixed(2);
    document.getElementById("resultadoFreteQuilometro").innerHTML = "Valor do frete por quilômetro: R$ " + valorFretePorQuilometro.toFixed(2);
    document.getElementById("resultadoTotalFrete").innerHTML = "Total do frete: R$ " + (valorFreteTotal + valorRastreamento + distancia).toFixed(2);
}