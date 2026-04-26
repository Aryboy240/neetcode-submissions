from typing import List

def read_integers() -> List[int]:
    result = input("").split(",")
    result2 = []

    for x in result:
        result2.append(int(x))
    return result2

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())