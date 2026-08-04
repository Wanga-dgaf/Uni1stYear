#Prompting user input
fName = input("Write your first name: ")
sName = input("Write your second name: ")
bio = input("Write your bio here: ")

#Create username
username = f"{fName[0]}{sName}"

#Full name in title case
fullName = f"{fName.title()} {sName.title()}"

noOfCharInBio = len(bio.strip())

refinedBio = bio.replace("I am", "I'm")

print(f"Full Name: {fullName}")
print(f"Username: {username}")
print(f"Bio: {bio.strip()}")
print(f"Number of Characters: {noOfCharInBio}")
print(f"Refined bio: {refinedBio.strip()}")
