def checkPalindrome(s:str) -> bool:
    for i in range(len(s)):
        if s[i] != s[-i-1]:
            return False
    return True

if __name__ == "__main__":
    number= input("put a number ")
    reverse=number[::-1]
    sum=int(number)+int(reverse)
    
    while not checkPalindrome(str(sum)):
        number=str(sum)
        reverse=number[::-1]
        sum=int(number)+int(reverse)
    print(sum)


    pass

