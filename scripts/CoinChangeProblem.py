
# coin chamge problem
A = [1,2,3]
n = 4
m=len(A)
def calc(a,m,n):
	table = [[0 for i in range(m)] for j in range(n+1)]
	for i in range(m):
		table[0][i] = 1
	for i in range(1,n+1):
		for j in range(m):
			x = table[i-A[j]][j] if i-A[j] >= 0 else 0
			y = table[i][j-1] if j>=1 else 0
			table[i][j] = x + y
	return table[n][m-1]
	
	
		