

# Spiral view of Binary Tree
# Print Spiral view

class Node 
def height(node):
	if node == None: return 0;
	lh = height(node.left)
	rh = height(node.right)
	return 1 + max(lh,rh)

def printGivenLevel(node,level,flag):
	if node == None: return None
	if level == 1 : print(node.root)
	if level > 1 and flag == True:
		printGivenLevel(node.left,level -1,flag)
		printGivenLevel(node.right,level -1, flag)
	else:
		printGivenLevel(node.right,level -1, flag)
		printGivenLevel(node.left,level - 1, flag)

def printSpiral(node):
	h = height(node)
	flag=False
	for i in range(1,h):
		printGivenLevel(node,i,flag)
		flag=True
		# revert flag to tranverse next level in opposite order
		