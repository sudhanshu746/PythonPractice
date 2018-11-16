
# Linked List
class node:
	def __init__(self,data=None,nextNode=None):
		self.data = data
		self.nextNode = nextNode
	def getData(self):
		return self.data
	def getNext(self):
		return self.nextNode
	def setNext(self,newData):
		self.nextNode = newData
class linkedlist:
	def __init__(self,head=None):
		self.head = head 
	def set(self,data):
		temp = node(data)
		temp.setNext(self.head)
		self.head  = temp
	def isEmpty(self):
		return self.head == None
	def get(self):
		if self.isEmpty(): return None
		cur = self.head
		print(cur.getData)
		self.head =  cur.getNext()
		return self.get()
	# def get(self):
		
		