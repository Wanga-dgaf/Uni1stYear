const NOTEBOOK_PRICE = 25.50;
const PEN_PRICE = 8.00;
const VAT_RATE = 0.14;




function calculateOrder() {
    const notebooks = Number(document.getElementById("notebooks").value) || 0;
    const pens = Number(document.getElementById("pens").value) || 0;
    const output = (document.getElementById("output"));
    
    if (notebooks < 0 || pens < 0){
        output.innerHTML = "Quantities cannot be less than 0";
        //alert (Quantities cannot be less than 0");
        return;
    }

    if (notebooks + pens === 0){
        output.innerHTML = "Please order atleast one item";
        return;
    }

    const subtotal = (notebooks * NOTEBOOK_PRICE) + (pens * PEN_PRICE);
    const vat = subtotal * VAT_RATE;
    const total = subtotal + vat;

    document.getElementById("output").innerHTML = "Subtotal: " + subtotal.toFixed(2) + "<br>" + "VAT: " + vat.toFixed(2) + "<br>" + "Total: " + total.toFixed(2);
}

/*
const calcBtn = document.getElementById("calcBtn");
calcBtn.addEventListener("click", calculateOrder);*/

document.getElementById("calcBtn").addEventListener("click", calculateOrder);














