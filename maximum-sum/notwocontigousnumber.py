def maxSumWithNoContiguousNumbers(array):
    length=len(array)
    M = [0]*(length+1)
    M[0]=0
    if(array[0]>array[1]):
        M[1]=array[0]
    else:
        M[1]=array[1]
    for ind in range(2, length):
        sumTilIMinusOne=M[ind-1]
        if(sumTilIMinusOne>M[ind-2]+array[ind]):
            M[ind]=sumTilIMinusOne
        else:
            M[ind]=M[ind-2]+array[ind]
    return M[length-1]

A=[-2,3,-16,100,-4,5]
print(maxSumWithNoContiguousNumbers(A))
