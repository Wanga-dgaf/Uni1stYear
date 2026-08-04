#prompt user for input
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))

#Display the numbers
print(f"Sum of {num1} and {num2} is: {round(num1 + num2, 2)}")
print(f"Difference of {num1} and {num2} is: {round(num1 - num2, 2)}")
print(f"Product of {num1} and {num2} is: {round(num1 * num2, 2)}")
print(f"Quotient of {num1} and {num2} is: {round(num1 / num2, 2)}")
print(f"Remainder of {num1} and {num2} is: {round(num1 % num2, 2)}")
print(f"floor division of {num1} and {num2} is: {round(num1 // num2, 2)}")