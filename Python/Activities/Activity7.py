numlist = [10, 90, 50, 20, 30, 40, 70, 60, 80]
numlist = input ("Enter a list of numbers seperated by commas: ").split(',')

#Caculate the sum of all te members in the list
Sum = 0
for num in numlist:
    sum += int (num)

#print the final sum
print("The Sum of the numbers in the list is:", sum)