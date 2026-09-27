function calculateVAT() {
    var price = document.getElementById("price").value;
    var vatStatus = document.getElementById("vatStatus").value;

    if (isNaN(price) || price == "") {
        alert("Only Numeric Values are required for Item Price!");
        return;
    }

    price = parseFloat(price);

    var vat = price * (vatStatus / 100);

    var total = price + vat;

    document.getElementById("total").value = total;
}