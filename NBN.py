# Ask Questions
# Next biggest Number for same number sequence

def swap(A,a,b):
	(A[a],A[b]) = (A[b],A[a])
	return A

def NBN(num):
	A=list(map(int,str(num)))
	N = len(A)
	index = 0
	for i in reversed(range(1,N)):
		if A[i] > A[i-1]:
			index = i
			break;
	if index == 0:
		print(num)
	else:
		next=index-1; min = index
		for i in range(N):
			if A[i] > A[next] and A[i] < A[min]: min = i
		A = swap(A,index-1,min)
		A[index:N] = sorted(A[index:N])
		print("".join(map(str,A)))
		
		