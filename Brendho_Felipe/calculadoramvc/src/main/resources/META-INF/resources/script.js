let firstOperand = '';
let secondOperand = '';
let currentOperation = null;
let shouldResetField = false;

function appendNumber(number) {
    const output = document.getElementById("output");
    if (shouldResetField) {
        resetOutput();
    }
    output.value += number;
}

function setOperation(operation) {
    if (currentOperation !== null) return;
    firstOperand = document.getElementById("output").value;
    currentOperation = operation;
    shouldResetField = true;
}

function clearOutput() {
    document.getElementById("output").value = '';
    firstOperand = '';
    secondOperand = '';
    currentOperation = null;
}

function resetOutput() {
    shouldResetField = false;
    document.getElementById("output").value = '';
}

function performCalculation() {
    if (currentOperation === null || shouldResetField) return;
    secondOperand = document.getElementById("output").value;

    fetch('/calculate', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            num1: parseFloat(firstOperand),
            num2: parseFloat(secondOperand),
            operation: currentOperation
        })
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById("output").value = data.result;
        firstOperand = data.result;
        currentOperation = null;
    })
    .catch(error => {
        console.error('Error:', error);
    });
}
