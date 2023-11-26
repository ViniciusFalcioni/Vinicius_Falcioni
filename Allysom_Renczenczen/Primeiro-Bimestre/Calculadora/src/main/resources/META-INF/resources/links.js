// Inicializando variáveis
let inputBuffer = "";
let operator = "";
let firstInput = "";

// Capturando elementos
const display = document.getElementById("display");
const buttons = document.getElementById("botoes");

// Função para atualizar o display
function updateDisplay() {
    display.value = inputBuffer;
}

// Evento de clique para os botões
buttons.addEventListener("click", async function(event) {
    const value = event.target.innerText;

    if (!isNaN(value) || value === ".") {
        // Se o valor é um número ou um ponto
        inputBuffer += value;
    } else if (["/", "*","+", "-"].includes(value)) {
        // Se o valor é um operador
        if (firstInput === "") {
            firstInput = inputBuffer;
            inputBuffer = "";
            operator = value;
        }
    }else if (value === "=") {
        // Se o valor é o sinal de igual
        if (firstInput !== "") {
            const response = await fetch(`http://localhost:8080/calculate?first=${encodeURIComponent(firstInput)}&second=${encodeURIComponent(inputBuffer)}&operator=${encodeURIComponent(operator)}`);
            if (response.ok) {
                inputBuffer = await response.text();
                firstInput = "";
                operator = "";
            } else {
                alert("Error: " + await response.text());
            }
        }
    }else if(value === "CE"){
        inputBuffer = "";
        firstInput = "";
        operator = "";
    }

    updateDisplay();
});
    
