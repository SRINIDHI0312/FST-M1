
import pandas as pd

# Create the data as a dictionary
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame
df = pd.DataFrame(data)

# Write the DataFrame to a CSV file
df.to_csv("users.csv", index=False)

print("CSV file 'users.csv' has been created.")

# Read the CSV file
df = pd.read_csv("users.csv")

# 1. Print the values only in the Usernames column
print("Usernames:")
print(df["Usernames"])

# 2. Print the username and password of the second row (index 1)
print("\nSecond row (username and password):")
print("Username:", df.loc[1, "Usernames"])
print("Password:", df.loc[1, "Passwords"])

# 3. Sort the Usernames column in ascending order and print data
print("\nUsernames sorted in ascending order:")
print(df.sort_values("Usernames"))

# 4. Sort the Passwords column in descending order and print data
print("\nPasswords sorted in descending order:")
print(df.sort_values("Passwords", ascending=False))
