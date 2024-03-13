
var codigo;
var horasTrabalhadas
var turno 
var categoria 
var salario 



function dados() {
    codigo =  document.getElementById('codigo').value*1;
    horasTrabalhadas = document.getElementById('horasTrabalhadas').value*1;
    turno = document.getElementById('turno').value.toUpperCase();
    categoria = document.getElementById('categoria').value.toUpperCase();
    salario = document.getElementById('salario').value*1;

    if (codigo == " " ||
        horasTrabalhadas == " " ||
        turno == " " ||
        categoria == " " ||
        salario == " ")
    {
    alert('preenche os campos')
    }
    else{
        alert('dados preenchidos')
        console.log(codigo)
        console.log(horasTrabalhadas)
        console.log(turno)
        console.log(categoria)
        console.log(salario)
        calculo();
        
    } 
};

function calculo() {

    if (categoria == "G" && turno == "M" || turno == "V" ) {
        salarioHora = ((salario+(salario*0.04))/horasTrabalhadas);
        document.getElementById('exibir').innerHTML = " O funcionario recebe " +salarioHora*1 + " por hora de trabalho";
    } else {
        if (categoria == "F" && turno == "N") {
            salarioHora = ((salario+(salario*0.02))/horasTrabalhadas);
            document.getElementById('exibir').innerHTML = " O funcionario recebe " +salarioHora*1 + " por hora de trabalho";
        } else {
            if(categoria == "F" && turno == "M" || turno == "V"){
                salarioHora = ((salario+(salario*0.01))/horasTrabalhadas);
            document.getElementById('exibir').innerHTML = " O funcionario recebe " +salarioHora*1 + " por hora de trabalho";
            }
        }
        
    }
    
    var auxilioAlimentacao;
    var salarioFinal;

            if (salario <= 800) {
                auxilioAlimentacao = salario * 0.25;
                document.getElementById('exibir2').innerHTML = "O auxilio alimentação do funcionario é: R$" + auxilioAlimentacao;
                salarioFinal = salario - auxilioAlimentacao;
                document.getElementById('exibir3').innerHTML = "O salario final do funcionario é: R$" + salarioFinal;
                
            } else if (salario > 800 && salario <= 1200) {
                auxilioAlimentacao = salario * 0.20;
                document.getElementById('exibir2').innerHTML = "O auxilio alimentação do funcionario é: R$" + auxilioAlimentacao;
                salarioFinal = salario - auxilioAlimentacao;
                document.getElementById('exibir3').innerHTML = "O salario final do funcionario é: R$" + salarioFinal;
            } else {
                auxilioAlimentacao = salario * 0.15;
                document.getElementById('exibir2').innerHTML = "O auxilio alimentação do funcionario é: R$" + auxilioAlimentacao;
                salarioFinal = salario - auxilioAlimentacao;
                document.getElementById('exibir3').innerHTML = "O salario final do funcionario é: R$" + salarioFinal;
            }

            console.log(auxilioAlimentacao)
            console.log(salarioFinal)

}

