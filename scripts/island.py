class test:
	def __init__(self,row,col,matrix):
		self.matrix = matrix
		self.row = row
		self.col = col
	def checksafe(self,i,j,visited):
		return ( i >= 0 and i < self.row and 
				j >= 0 and j < self.col and 
				not visited[i][j] and self.matrix[i][j])
	def DFS(self,i,j,visited):
		rownum=[-1,-1,-1,0,0,1,1,1]
		colnum = [-1,0,1,-1,1,-1,0,1]
		visited[i][j] = True
		for k in range(8):
			if self.checksafe(i + rownum[k],j + colnum[k],visited):
				self.DFS(i + rownum[k],j + colnum[k],visited)
	def countIsland(self):
		visited = [[False for i in range(self.col)] for j in range(self.row)]
		count = 0
		for i in range(self.col):
			for j in range(self.row):
				if visited[i][j] == False and self.matrix[i][j] == 1:
					self.DFS(i,j,visited)
					count += 1
		return count
	