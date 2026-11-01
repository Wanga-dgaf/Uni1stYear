const targetTime = new Date("2027-09-24");
console.log(targetTime);

function updateTimer(){
    const currentTime = Date.now();
    const difference = targetTime - currentTime;

    //Convert milliseconds into days, hours, minutes, seconds
    const days = Math.floor(difference / (1000 * 60 * 60 * 24));
    const hours = Math.floor((difference % (1000 * 60 * 60 * 24)) / (1000  * 60 * 60));
    const minutes = Math.floor((difference % (1000 * 60 * 60)) / (1000  * 60));
    const seconds = Math.floor((difference % (1000 * 60)) / (1000));

    /* const countdownTimer = document.getElementById("countdown-timer");
    
    countdownTimer.textContent = `${days} ${hours} ${minutes} ${seconds}` */

    // Update each specific DOM element's textContent
    document.getElementById("days").textContent = days;
    document.getElementById("hours").textContent = hours;
    document.getElementById("minutes").textContent = minutes;
    document.getElementById("seconds").textContent = seconds;

}

//Call Method
updateTimer();

setInterval(updateTimer, 1000);


const signUpBtn = document.getElementById("signUpBtn");


function registeredClient(){
    const formEmail = document.getElementById("formEmail").value;

     if(!(formEmail.includes("@gmail.com"))){
        alert('Invalid type of email (email must contain "@gmail.com")');
     } else {
        alert("Congratulation " + formEmail + ", you have subscribed to our newspaper");
        formEmail.value = "";
     }

}

signUpBtn.addEventListener("click", registeredClient);

