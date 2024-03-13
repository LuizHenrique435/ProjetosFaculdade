$(document).ready(function(){
    // Aplicando a máscara de entrada à entrada de data
    $('#dataInput').mask('00/00/0000');
});

function escreverDataPorExtenso() {
    var dataInput = document.getElementById("dataInput").value;
    var partesData = dataInput.split('/');
    var dia = partesData[0];
    var mes = partesData[1];
    var ano = partesData[2];

    var meses = ["janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"];

    var dataPorExtenso = dia + " de " + meses[mes - 1] + " de " + ano;

    document.getElementById("resultado").innerText = "Data por extenso: " + dataPorExtenso;
}