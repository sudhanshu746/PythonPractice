from collections import defaultdict
def solution(A):
	N = len(A)
	hashmap=defaultdict(list)
	result = 0
	for i in range(0,N):
		if A[i] in hashmap: 
			hashmap[A[i]].append(i)
		else: 
			hashmap[A[i]] = [i]
		result = max(result,abs(max(hashmap[A[i]])-min(hashmap[A[i]])))
	return result

print(solution([4,6,2,2,6,6,1]))