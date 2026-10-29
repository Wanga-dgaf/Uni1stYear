const clubs = ["Chess Club", "Coding Club", "Debate Society", "Drama Club", "Soccer Club"];
const clubList = document.getElementById("clubList");

function displayClubs(){

    // Clear the list first so clubs are not repeated if clicked multiple times
    clubList.innerHTML = "";

    for(let i = 0; i < clubs.length; i++){

        
        // Create a list item element for every club
        const listItem = document.createElement("li");
    
        // Assign the current club name to the list item text
        listItem.textContent = clubs[i];
    
        // Add (append) the list item into the clubList container[cite: 9]
        clubList.appendChild(listItem);

    }

    document.getElementById("clubCount").innerHTML = "There are " + clubs.length + " clubs on campus";

    document.getElementById("firstLast").innerHTML = clubs[0] +"<br>"+ clubs[clubs.length - 1];

    
}

const showBtn = document.getElementById("showBtn");
showBtn.addEventListener("click", displayClubs);