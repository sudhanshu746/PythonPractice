
# Find diameter of a binary tree
# Do you want me to create binary tree first: yes

class BinaryTree:
	def __init__(self,root):
		self.root = root
		self.left = None
		self.right = None 
	def setLeft(self,newNode):
		if self.left == None:
			self.left = BinaryTree(newNode)
		else:
			temp = BinaryTree(newNode)
			temp.left = self.left
			self.left = temp
	def setRight(self,newNode):
		if self.right == None:
			self.right = BinaryTree(newNode)
		else:
			temp = BinaryTree(newNode)
			temp.right = self.right
			self.right = temp
	def getLeft(self):
		return self.left
	def getRight(self):
		return self.right
	def getRoot(self):
		return self.root
	def height(self):
		if self.getRoot() == None:
			return 0;
		lh =  self.height(self.getLeft())
		rh = self.height(self.getRight())
		return 1 + max(lh, rh)
	def diameter(root):
		if root == None: return 0;
		lh = height(root.left)
		rh = height(root.right)
		ld = diameter(root.left)
		rd = diameter(root.right)
		return max(lh + rh, max(ld + rd))
		
		# max(lh + rh + 1,max(ld + rd))
		self,
		
	
		
	
	
			