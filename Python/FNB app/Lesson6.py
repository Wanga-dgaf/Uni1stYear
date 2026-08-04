students = [
    {"name": "Wanga", "maths": 85, "english": 75, "science": 99},
    {"name": "Tumisho", "maths": 70, "english": 78, "science": 60},
    {"name": "Tshego", "maths": 40, "english": 88, "science": 70},
    {"name": "Junior", "maths": 100, "english": 53, "science": 60},
    {"name": "Lerato", "maths": 30, "english": 75, "science": 84},
    {"name": "Lethabo", "maths": 36, "english": 40, "science": 30}
]

students_average = []


print(f"{students}")

for student in students :
   
    
    """
    print(student["name"])
    print(student["maths"])
    print(student["english"])
    print(student["science"])
    """
    avg = round(float(student["maths"] + student["english"] + student["science"]) / 3, 2)

    if avg >= 80:
        letter_grade = "A"
    elif avg >= 70:
        letter_grade = "B"
    elif avg >= 60:
        letter_grade = "C"
    elif avg >= 50:
        letter_grade = "D"
    else:
        letter_grade = "F"

    #Pass or fail
    if avg >= 50:
        status = "Pass"
    else:
        status = "Fail"
    
    print(f"Student '{student["name"]}' got an average mark of {avg} their grade status is {letter_grade} and their status is {status}")

    
    students_average.append({"name" : student["name"], "average" : avg, "grade" : letter_grade, "status" : status})

print(f"\n{students_average}")

while true:
    #Search...




