async function performCalculation() {
    const a = parseFloat(document.getElementById("a").value);
    const b = parseFloat(document.getElementById("b").value);
    const operationType = document.getElementById("operation").value;

    const requestPayload = {
        a: a,
        b: b,
        operationType: operationType
    };

    const response = await fetch("/calculate", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(requestPayload)
    });

    const data = await response.json();
    document.getElementById("result").innerText = data.result;
}
