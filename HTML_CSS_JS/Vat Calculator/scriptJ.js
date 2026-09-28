function calculateVAT() {
    const priceInput = document.getElementById("price").value.trim();
    const vatStatusInput = document.getElementById("vatStatus").value;

    // Validate price: must not be empty and must be a valid number
    if (priceInput === "" || isNaN(priceInput) || parseFloat(priceInput) < 0) {
        alert("Please enter a valid numeric item price!");
        return;
    }

    const price = parseFloat(priceInput);
    const vatRate = parseFloat(vatStatusInput) || 0; // Fallback to 0 if empty/invalid

    const vat = price * (vatRate / 100);
    const total = price + vat;

    // Display formatted to 2 decimal places
    document.getElementById("total").value = total.toFixed(2);
}