let currentInput = "";
let firstNumber = null;
let currentOperation = null;

function appendCharacter(character) {
    currentInput += character;
    updateDisplay();
}

function updateDisplay() {
    document.getElementById('display').value = currentInput;
}

function setOperation(operation) {
    if (firstNumber === null) {
        firstNumber = currentInput;
        currentOperation = operation;
        currentInput = "";
    }
}

function calculate() {
    const requestBody = {
        num1: parseFloat(firstNumber),
        num2: parseFloat(currentInput),
        operation: currentOperation
    };

    fetch("/calculate", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(requestBody)
    })
    .then(response => response.json())
    .then(data => {
        if (data.message) {
            alert(data.message);
        } else {
            currentInput = data.result.toString();
            updateDisplay();
            resetCalculationState();
        }
    });
}

function resetCalculationState() {
    currentInput = "";
    firstNumber = null;
    currentOperation = null;
}

function reset() {
    resetCalculationState();
    updateDisplay();
}
