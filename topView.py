class node:
	def __init__(self,data):
		self.data = data
		self.left = None
		self.right = None
'''
Top View
// min --> Minimum horizontal distance from root
// max --> Maximum horizontal distance from root
// hd  --> Horizontal distance of current node from root 
We ned to check horizontal distance when they are on same vertical line 
HD for root is 0, for left is -1 and right -2
you will require dict to update key as hd and value as array of items 
verticalOrderTranversal(node, hd, hash) -- recursively update hash value 
printVO(node) -- print node values 
'''
def verticalOrderTranversal(node,hd,hash):
	if node is None: return 
	try: 
		hash[hd].append(node.data)
	except:
		hash[hd] = [node.data]
	verticalOrderTranversal(node.left,hd-1,hash)
	verticalOrderTranversal(node.right,hd+1,hash)

def printVerticalOrder(node):
	hash = dict()
	hd = 0
	verticalOrderTranversal(node,hd,hash)
	for couter, value in enumerate(sorted(hash)):
		for i in hash[value]: print(i)
		print

root = node(8)
root.left = node(7)
root.left.left = node(6)
root.left.right = node(9)
root.right = node(10)
root.right.left  = node(2)
root.right.left.left   = node(1)
printVerticalOrder(root)