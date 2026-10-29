const NOTEBOOK_PRICE = 25.50;
const PWN_PRICE = 8.00;
const VAT_RATE = 0.14;

function calculateOrder() {
const notebooks = Number(document.getElementById("notebook").value);
const pens = Number(document.getElementById("pens").value);
const output = (document.getElementById("output").value);

if (notebook < 0 || pens < 0){
output.innerHTML = "Quantities cannot be less than 0";
//alert (Quantities cannot be less than 0");
return;
}

if (notebooks + pens === 0){
output.innerHTML = "Please order atleast one item";
return;
}
const subtotal = (notebooks * NOTEBOOK_PRICE) + (pens * PEN_PRICE);
const vat = subtotal = VAT_RATE;
const total = subtotal + vat;
}