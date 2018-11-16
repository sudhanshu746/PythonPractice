
# LinkedList 

class node:
	def __init__(self,data=None,next=None):
		self.data = data
		self.next = next
	def getData(self):
		return self.data
	def getNext(self):
		return self.next
	def setNext(self,newNext):
		self.next = newNext
class linkedlist:
	def __init__(self,head=None):
		self.head = head
	def insert(self,data):
		temp = node(data)
		temp.setNext(self.head)
		self.head = temp
	def isEmpty(self):
		return self.head == None
	def display(self):
		if self.isEmpty() : return None
		cur = self.head
		print(cur.getData())
		self.head =  cur.getNext()
		return self.display()
	
	## challange 1
	def oddeven(self):
		if self.isEmpty(): return None
		cur = self.head
		
		


def swap(ar,a,b):
	ar[a],ar[b] = ar[b],ar[a]
	return ar
r=[];l = [1,2,3,4,5,6];mid = int(len(l)/2);count=0
for i in reversed(range(0,len(l))):
	if(l[i] % 2 ==0) and (count < mid): r.append(l[i]);count += 1
	print(count)
	if(l[i] % 2 !=0  and count >= mid): r.append(l[i]); count -= 1
	
	
			



