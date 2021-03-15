def insertionSort(unSortedList):
  iteration=1
  for i in range(1, len(unSortedList)):
     key = unSortedList[i]
     print("working on key",key)
     while(unSortedList[i-1]>key and i>0):
          unSortedList[i]=unSortedList[i-1]
          i = i-1
     unSortedList[i]=key
     print("after %s iteration"%iteration, unSortedList)
     iteration = iteration + 1
  print("after sorting completely", unSortedList)

          
     





unSortedList=[9,1,3,11,7,4,2,8,10,5,6]
print("numbers before sorting", unSortedList)
insertionSort(unSortedList)

