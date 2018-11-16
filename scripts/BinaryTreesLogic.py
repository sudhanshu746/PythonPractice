class node:
	def __init__(self,data):
		self.value=data
		self.left=None 
		self.right=None
		
		
# Compare Two Trees 
def compareTrees(a,b):
	if a is None and b is None: return True
	if a is not None and b is not None:
		return (a.value == b.value and compareTrees(a.left,b.left) and compareTrees(a.right,b.right))
#		
# Left view of binary Tree
def leftView(a,level,max_level):
	if a is None: return 
	if max_level[0] < level:
		print(a.value)
		max_level[0] = level 
	leftView(a.left,level+1,max_level)
	leftView(a.right,level+1,max_level)
	
def printLeftView(a):
	max_level=[0]
	leftView(a,1,max_level)

#
# Right view of binary Tree
def rightView(a,level,max_level):
	if a is None: return 
	if max_level[0] < level:
		print(a.value)
		max_level[0] = level 
	rightView(a.right,level+1, max_level)
	rightView(a.left,level+1, max_level)

def printRightView(a):
	max_level=[0]
	rightView(a,1, max_level)
#
# Top and Bottom view of binary Tree
def verticalOrderTranversal(a,hd,hash):
	if a is None: return 
	else: print("~",a.value)
	try: 
		hash[hd].append(a.value)
	except:
		hash[hd] = [a.value]
	verticalOrderTranversal(a.left,hd-1,hash)
	verticalOrderTranversal(a.right,hd+1,hash)
def topView(a):
	hash = dict()
	hd=0
	verticalOrderTranversal(a,hd,hash)
	for counter,value in enumerate(sorted(hash)):
		for i in hash[value]:
			print(i);
	print
def bottomView(a):
	hash = dict()
	hd = 0
	verticalOrderTranversal(a,hd,hash)
	for counter,value in enumerate(sorted(hash)):
		if(len(hash[value])>1):
			print(hash[value][1:])
		else: print(hash[value][0])

def main():
	a = node(1)
	a.left = node(2) 
	a.right = node(3) 
	a.left.left = node(4) 
	a.left.right = node(5)
	b = node(1) 
	b.left = node(2) 
	b.right = node(3) 
	b.left.left = node(4) 
	b.left.right = node(5)
	if compareTrees(a,b):
		print("Identical")
	else: 
		print("Not Identical")
	
	print("Left Veiw")
	printLeftView(a)
	print("Top Veiw")
	topView(a)
	print("Bottom View")
	bottomView(a)
if __name__ == '__main__':
	main()
	
def intersection(a,b):
	return (a+b)