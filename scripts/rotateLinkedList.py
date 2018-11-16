'''
Rotate Doubly Linked List by N time
'''

class node:
	def __init__(self,data):
		self.data = data 
		self.next = None
class linkedlist:
	def __init__(self):
		self.head = None
	def push(self,new_data):
		new_node = node(new_data)
		new_node.next = self.head
		self.head = new_node
	def printll(self):
		temp = self.head
		while(temp):	
			print(temp.data)
			temp = temp.next
	def rotate(self,k):
		if k == 0 or k is None :return 
		count=1
		current = self.head
		while(count <k and current is not None):
			current = current.next
			count += 1
		if current is None:return 
		kth = current
		while(current.next is not None):
			current = current.next 
			print("--",str(kth.data))
		current.next = self.head 
		self.head = kth.next
		print("-!-",str(kth.data))
		kth.next = None

l = linkedlist()
for i in range(100,0,-5):
	l.push(i)
l.printll()
l.rotate(3)
print("--------------")
l.printll()
