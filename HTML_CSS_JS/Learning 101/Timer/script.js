// This script controls the countdown timer.
// It stores the timer ID, the starting time, and whether the timer is currently running.
let countdown;
const defaultTime = 240 * 60; // The timer starts at 4 hours, converted to 14,400 seconds.
let timeRemaining = defaultTime;
let isRunning = false;

// These variables get the HTML elements that are used to show and control the timer.
const display = document.getElementById('display');
const startBtn = document.getElementById('startBtn');
const pauseBtn = document.getElementById('pauseBtn');
const resetBtn = document.getElementById('resetBtn');

// This function converts the total seconds into hours, minutes, and seconds and displays them in HH:MM:SS format.
function updateDisplay() {
    const hours = Math.floor(timeRemaining / 60 / 60);
    // % 60 keeps the minutes between 0 and 59, so the timer does not show 75 minutes.
    const minutes = Math.floor(timeRemaining / 60) % 60;
    const seconds = timeRemaining % 60;

    // padStart adds a leading zero so values always appear with 2 digits.
    display.textContent = `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;
}

// This function starts the countdown if it is not already running.
function startTimer() {
    if (isRunning) return; // Stops duplicate intervals from being created.

    isRunning = true;
    countdown = setInterval(() => {
        if (timeRemaining > 0) {
            timeRemaining--; // Decrease the timer by one second.
            updateDisplay(); // Update the displayed time every second.
        } else {
            clearInterval(countdown); // Stop the countdown when it reaches zero.
            isRunning = false;
            alert("Time's up!"); // Show a popup when the countdown ends.
        }
    }, 1000); // Run this code once every 1000 milliseconds (1 second).
}

// This function pauses the timer by stopping the repeating interval.
function pauseTimer() {
    clearInterval(countdown);
    isRunning = false;
}

// This function resets the timer back to the default value and updates the display.
function resetTimer() {
    clearInterval(countdown);
    isRunning = false;
    timeRemaining = defaultTime;
    updateDisplay();
}

// Connect each button to its matching JavaScript function.
startBtn.addEventListener('click', startTimer);
pauseBtn.addEventListener('click', pauseTimer);
resetBtn.addEventListener('click', resetTimer);

// Show the initial timer value when the page loads.
updateDisplay();
