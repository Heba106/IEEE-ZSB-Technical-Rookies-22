import random
def Comp( numlist , randlist):
    hits = 0
    misses = 0
    newrand = []
    newnum = []
    for i in range(3):
        if randlist[i] == numlist[i]:
            hits += 1
        else:  # excluding the hit numbers from the list to compare again and see if there is any missed number
            newrand.append(randlist[i])
            newnum.append(numlist[i])
    for i in newnum:
        for j in newrand:
            if i == j:
                misses += 1

    return (hits, misses)

Hit=0
Miss=0
#initiating a 3 digits random number and store its digit in a list
rand = random.randint(100, 999)
print (rand)
randlist=[]
for i in range (3):
     if (rand>0):
         x = rand % 10
         rand=int( rand/10)
     randlist.append(x)

#taking the input number and storing its digits  into a list
while Hit != 3:
    num = int(input("Enter a 3 digits number:"))
    numlist = []
    for i in range(3):
        if (num > 0):
            x = num % 10
            num = int(num / 10)
        numlist.append(x)

#passing the random list and input list to the comparing function
    Hit,Miss= Comp(randlist,numlist)
    print(Hit,'Hit',Miss,'Miss')
#after guessing the correct number finally ending the program
print('you guessed it right')

