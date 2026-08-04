#prompt user for input
name = input("Enter your name: ")
subject_1_mark = float(input("Enter your mark for subject 1: "))
subject_2_mark = float(input("Enter your mark for subject 2: "))
subject_3_mark = float(input("Enter your mark for subject 3: "))

#calculate average
average = (subject_1_mark + subject_2_mark + subject_3_mark) / 3

#Assign letter grade based on average
if average >= 80:
    letter_grade = "A"
elif average >= 70:
    letter_grade = "B"
elif average >= 60:
    letter_grade = "C"
elif average >= 50:
    letter_grade = "D"
else:
    letter_grade = "F"

#Pass or fail
if average >= 50:
    status = "Pass"
else:
    status = "Fail"

print("\n--- Student Report ---")
print(f"|  Name: {name}             |")
print(f"|  Marks: Subject 1: {subject_1_mark}, |\n|         Subject 2: {subject_2_mark}, |\n|         Subject 3: {subject_3_mark}  |")
print(f"|  Average: {round(average, 2)}           |")
print(f"|  Letter Grade: {letter_grade}         |")
print(f"|  Status: {status}            |")

if subject_1_mark < 40: 
    print("Subject 1 needs intervention.")
if subject_2_mark < 40:
    print("Subject 2 needs intervention.")
if subject_3_mark < 40:
    print("Subject 3 needs intervention.")
