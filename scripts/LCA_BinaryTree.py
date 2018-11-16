
#Lowest Common Ancestor - -# Brute Force
class BinaryTree:
	def __init__(self,root):
		self.root = root
		self.left = None
		self.right = None
	def setLeft(self,n):
		if self.left == None:
			self.left = BinaryTree(n)
		else:
			tree = BinaryTree(n)
			tree.left = self.left 
			self.left = tree
	def setRight(self,n):
		if self.right == None:
			self.right = BinaryTree(n)
		else:
			tree = BinaryTree(n)
			tree.right = self.right 
			self.right = tree
	def getRight(self):
		return self.right
	def getLeft(self):
		return self.left
	def getRoot(self):
		return self.root
	
def LCA(t,a,b):
	if(t == None): return None
	if(t.getRoot() == a or t.getRoot() == b): return t 
	left = LCA(t.getLeft(),a,b)
	right = LCA(t.getRight(),a,b)
	if(left != None and right != None): return t
	if(left != None): return left
	else: return right 