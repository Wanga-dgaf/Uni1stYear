
contacts = [
    {'Name': 'Wanga', 'Phone Number': '0651234567', 'Email': 'wanga@gmail.com'},
    {'Name': 'Tumisho', 'Phone Number': '0811234567', 'Email': 'tumisho@mail.com'},
    {'Name': 'Wanga', 'Phone Number': '0661234567', 'Email':'tshego@gmail.com'}
]

while True: 
    print("\n--- Contact Book ---")
    print("1. Add Contact")
    print("2. Search Contact")
    print("3. Delete Contact")
    print("4. View All")
    print("5. Exit")

    choice = input("Choose an option(1-5): ")
    #1. Add Contact
    if choice == "1":
        print("\n--- Add Contact ---")
        name = input("Enter name: ").strip()
        phone_number = input("Enter phone number: ").strip()
        email = input("Enter email: ").strip()

        #Append new dictionary to the contacts list
        contacts.append({"Name": name, "Phone Number": phone_number, "Email": email})
        print(f"Contact '{name}' added successfully!!!")

    #2. Search Contact
    elif choice == "2":
        print("\n--- Search Contact ---")
        name = input("Write the contact you would like search: ").strip().title()
        found = False
        for contact in contacts:
            if contact['Name'].title() == name:
                print(f"\n--- CONTACT FOUND ---\n{contact['Name']}, {contact['Phone Number']}, {contact['Email']}") 
                found = True
                
        if not found:
                print("Contact not found")
    
    #3. Delete contact
    elif choice == "3":
        print("\n--- Delete Contact ---")
        #prompt user input
        name = input("Write the contact you would like delete: ").strip().title()
        found = False
        for contact in contacts: 
            if contact['Name'].title() == name:
                contacts.remove(contact)
                found = True
                print("Contact Deleted")
                break

        if not found:
                print("Contact not found")
            
    #4. View All
    elif choice == "4":
        print("View All Contacts")
        print(contacts)
        

    #5. Exit
    elif choice == "5":
        break
    
        


#_________________________________________________________________________________________________
"""
#AI wrote this

# Store contacts as a list of dictionaries
contacts = [
    {'Name': 'Wanga', 'Phone Number': '0651234567', 'Email': 'wanga@gmail.com'},
    {'Name': 'Tumisho', 'Phone Number': '0811234567', 'Email': 'tumisho@mail.com'},
]


def add_contact(name, phone_number, email):
    contacts.append({"Name": name, "Phone Number": phone_number, "Email": email})


def search_contact(name):
    for contact in contacts:
        if contact["Name"].lower() == name.lower():
            return contact
    return None


def delete_contact(name):
    for contact in contacts:
        if contact["Name"].lower() == name.lower():
            contacts.remove(contact)
            return True
    return False


def view_all():
    if not contacts:
        print("No contacts found.")
        return

    print("\nAll Contacts")
    print("-" * 30)
    for contact in contacts:
        print(f"Name: {contact['Name']}")
        print(f"Phone Number: {contact['Phone Number']}")
        print(f"Email: {contact['Email']}")
        print("-" * 30)


while True:
    print("\n1. Add Contact")
    print("2. Search Contact")
    print("3. Delete Contact")
    print("4. View All")
    print("5. Exit")

    choice = input("Enter your choice: ")

    if choice == "1":
        name = input("Enter name: ")
        phone_number = input("Enter phone number: ")
        email = input("Enter email: ")
        add_contact(name, phone_number, email)
        print("Contact added successfully.")
    elif choice == "2":
        name = input("Enter name to search: ")
        result = search_contact(name)
        if result is None:
            print("Contact not found.")
        else:
            print(result)
    elif choice == "3":
        name = input("Enter name to delete: ")
        if delete_contact(name):
            print("Contact deleted successfully.")
        else:
            print("Contact not found.")
    elif choice == "4":
        view_all()
    elif choice == "5":
        print("Goodbye!")
        break
    else:
        print("Invalid choice. Please try again.")
"""