function calcularIMC() {
    var nome = document.getElementById("nome").value;
    var altura_cm = parseFloat(document.getElementById("altura").value);
    var peso = parseFloat(document.getElementById("peso").value);

    var altura_m = altura_cm / 100;
    var imc = peso / (altura_m * altura_m);
    var classificacao = "";

    if (imc < 16) {
        classificacao = "Baixo peso muito grave";
    } else if (imc >= 16 && imc <= 16.99) {
        classificacao = "Baixo peso grave";
    } else if (imc >= 17 && imc <= 18.49) {
        classificacao = "Baixo peso";
    } else if (imc >= 18.5 && imc <= 24.99) {
        classificacao = "Peso normal";
    } else if (imc >= 25 && imc <= 29.99) {
        classificacao = "Sobrepeso";
    } else if (imc >= 30 && imc <= 34.99) {
        classificacao = "Obesidade grau I";
    } else if (imc >= 35 && imc <= 39.99) {
        classificacao = "Obesidade grau II";
    } else {
        classificacao = "Obesidade grau III";
    }

    var resultado = nome + " possui índice de massa corporal igual a " + imc.toFixed(2) + ", sendo classificado como: " + classificacao + ".";
    document.getElementById("resultado").innerHTML = resultado;
}