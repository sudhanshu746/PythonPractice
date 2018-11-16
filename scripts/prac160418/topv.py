'''
left View of a Binary tree
'''

class node:
	def __init__(self,data):
		self.data = data
		self.left = None
		self.right = None

'''
def topUtil(node,level,max_level)
def topview(node)
'''
def leftUtil(node,level,max_level):
	if node is None: return 
	if max_level[0] < level:
		print(node.data)
		max_level[0] = level
	topUtil(node.left,level+1, max_level)
	topUtil(node.right,level+1,max_level)

def leftview(node):
	max_level = [0]
	topUtil(node,1,max_level)

def rightUtil(node, level, max_level):
	if node is None: return 
	if max_level[0] < level:
		print(node.data)
		max_level[0] = level
	rightUtil(node.right,level+1, max_level)
	rightUtil(node.left,level+1,max_level)
def rightview(node):
	max_level = [0]
	rightUtil(node,1,max_level)

	
'''
hd - Horizontal distance
hash - hashmap/dict key -> hd and value -> respective element
topUtil(node,hd,hash)
topView(node)
'''
from collections import *
def VerticalOrderTranversal(node,hd,hash):
	if node is None: return 
	try: 
		print(hd,node.data)
		hash[hd].append(node.data)
	except:
		print(hd,node.data)
		hash[hd] = [node.data]
	VerticalOrderTranversal(node.left,hd-1,hash)
	VerticalOrderTranversal(node.right,hd+1,hash)
	
def topview(node):
	hash = dict()
	hd = 0
	VerticalOrderTranversal(node,hd,hash)
	for counter,value in enumerate(sorted(hash)):
	    print(counter,value)
	    for i in hash[value]:
	        print(i);break;
		print

def bottomview(node):
	hash = dict()
	hd = 0
	VerticalOrderTranversal(node,hd,hash)
	for counter,value in enumerate(sorted(hash)):
	    if(len(hash[value]) > 1): print(hash[value][1:]
		else: print(hash[value][0])


		
'''
root
left -> right 
right -> left 
-> 
'''
def Spiralorder(root,flag=True):
    if root:
        if flag:
            print(root.data),
            printInorder(root.left,flag=True)
            printInorder(root.right,flag=False)
        else:
            print(root.data),
            printInorder(root.right,flag=False)
            printInorder(root.left,flag=True)

def spiralView(root):
	if root is None: return
	srl,slr = [],[]
	srl.push(root)
	while(srl or slr):
		while(srl):
			a = srl.pop()
			print(a.data)
			if(a.right):
				slr.append(a.right)
			elif(a.left):
				slr.append(a.left)
		while(slr):
			a = slr.pop()
			print(a.data)
			if(a.left):	
				srl.append(a.left)
			elif(a.right): srl.append(a.right)
		
	
## ZigZag view 

# @return a list of lists of integers
def zigzag(node):
    if node is None: return
    sol = []
    thisLevel = []
    thisLevel.append(node)
    l2r = True
    while len(thisLevel)>0:
        levelSol = []
        nextLevel = []
        while len(thisLevel) > 0:
            n = thisLevel.pop()
            print(n.data)
            levelSol.append(n.data)
            if l2r:
                if node.left != None:
                    nextLevel.append(n.left)
                if node.right != None :
                    nextLevel.append(n.right)
            else:
                if node.left != None:
                    nextLevel.append(n.right)
                if node.right != None :
                    nextLevel.append(n.left)
        thisLevel = nextLevel
        sol.append(levelSol)
        l2r = not l2r
    return sol;

#if max_level[0] < level:
root = node(1)
root.left = node(2)
root.right = node(3)
root.left.left = node(4)
root.left.right = node(5)
root.right.left = node(6)
root.right.right = node(7)
root.right.left.right = node(8)
root.right.right.right = node(9)
print("left  View of Binary Tree")
leftview(root)
print("Right View of Binary Tree")
rightview(root)
print("Top View of Binary Tree")
topview(root)
print("Bottom View of Binary Tree")
bottomview(root)