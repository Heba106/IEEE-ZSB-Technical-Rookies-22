
s= input()
Input=(s.split()) #Splitting  input and putting it into list
for i in range(len(Input)):
  Input[i]=int(Input[i]) #convert input list to int
lst = []
for i in Input:
    if i not in lst:
        lst.append(i)
print(lst)