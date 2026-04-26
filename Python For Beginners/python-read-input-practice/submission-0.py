def add_two_numbers() -> int:
    result = []
    for x in (list(input("").split(","))):
        result.append(int(x))
    return result[0] + result[1]

# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
