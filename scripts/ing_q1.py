'''
# Longest increasing Subsequence Problem | Dp -3 
The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
{{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} }
'''
arr = ((5, 24), (39, 60), (15, 28), (27, 40), (50, 90))

arr = (10, 22, 9, 33, 21, 50, 41, 60, 80)

def solution(arr):
	max = 0
	n = len(arr)
	mcl = [1 for i in range(n)]
	for i in range(1,n):
		print("~")
		for j in range(0,i):
			#print(i,j)
			if( arr[i] > arr[j] and mcl[i] < mcl[j] + 1 ):
				print(mcl)
				mcl[i] = mcl[j] + 1 
	#print(mcl)
	if i in range(n):
		if(max < mcl[i]):
			max = mcl[i]
	print(max)
			
			
	
solution(arr)