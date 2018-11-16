l = [2,4,3,1]
def findInArrayBS(l,i,j,ele):
	while(i<=j):
		mid = int(i + (j - 1)/2)
		if(l[mid] == ele):
			return mid
		elif(l[mid] < ele):
			i = mid + 1
		else:
			j = mid - 1
	return -1