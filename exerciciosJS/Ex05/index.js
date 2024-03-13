function calcs(num1, num2, operacao){
    var num1 = document.getElementById('numero1').value*1
    var operacao = document.getElementById('operacao').value.toLowerCase()
    var num2 = document.getElementById('numero2').value*1

    console.log(num1)
    console.log(num2)
    console.log(operacao)

    var resultado=0;

    if (operacao == 'adicao' || operacao == 'adição') {
        
        resultado = (num1+num2);
        resultado = document.getElementById('exibir').innerHTML = "O resultado é: " + resultado
    } else {
        if (operacao == 'subtracao' || operacao =='subtração') {
            resultado = (num1-num2);
            resultado = document.getElementById('exibir').innerHTML = "O resultado é: " +resultado
        } else {
            resultado = document.getElementById('exibir').innerHTML = "A operação é inexistente "
        }
        
    }

}