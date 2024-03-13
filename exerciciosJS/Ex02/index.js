function identificarFaixaEtaria() {
    var idade = parseInt(document.getElementById("idade").value);
    var faixaEtaria = "";

    if (idade >= 0 && idade < 15) {
        faixaEtaria = "Criança";
    } else if (idade >= 15 && idade < 30) {
        faixaEtaria = "Jovem";
    } else if (idade >= 30 && idade < 60) {
        faixaEtaria = "Adulto";
    } else {
        faixaEtaria = "Idoso";
    }

    document.getElementById("resultadoFaixaEtaria").innerHTML = "Faixa etária: " + faixaEtaria;
}

function calcularMedia() {
    var nota1 = parseFloat(document.getElementById("nota1").value);
    var nota2 = parseFloat(document.getElementById("nota2").value);
    var nota3 = parseFloat(document.getElementById("nota3").value);

    var peso1 = 2;
    var peso2 = 5;
    var peso3 = 3;

    var somaDosPesos = peso1 + peso2 + peso3;
    var media = ((peso1 * nota1) + (peso2 * nota2) + (peso3 * nota3)) / somaDosPesos;

    var classificacao = "";
    if (media >= 9 && media <= 10) {
        classificacao = "A";
    } else if (media >= 8 && media < 9) {
        classificacao = "B";
    } else if (media >= 7 && media < 8) {
        classificacao = "C";
    } else if (media >= 6 && media < 7) {
        classificacao = "D";
    } else if (media >= 5 && media < 6) {
        classificacao = "E";
    } else {
        classificacao = "F";
    }

    document.getElementById("resultadoMedia").innerHTML = "A média do aluno é " + media.toFixed(2) + " e a sua classificação é " + classificacao;
}