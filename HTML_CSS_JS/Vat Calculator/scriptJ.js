function calculateVAT() {
    let price = document.getElementById("price").value;
    let vatStatus = document.getElementById("vatStatus").value;

    if (isNaN(price) || price == "") {
        alert("Only Numeric Values are required for Item Price!");
        return;
    }

    price = parseFloat(price);

    let vat = price * (vatStatus / 100);

    let total = price + vat;

    document.getElementById("total").value = total;
}