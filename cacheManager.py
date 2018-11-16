# Design a cache manager for a browser such that each URL has a static number and the URL contains top 100 based on the static number 

# without predefined funtions
class cacheManager:
	def __init__(self,capacity):
		self.c = capacity
		self.cache = {}
		self.count = 1
	def set(self,item,p):
		try:
			if self.c >= self.count: 
				self.cache[(self.count,item)] = p
				self.count += 1
			else: return -1
		except:
			return -1;
	def get(self,num):
		if len(self.cache) < num: print("Insufficient items"); return -1
		try:
			i = 0;
			for k,v in sorted(self.cache.items(),key=lambda x:x[1]):
				if i < num:
					print(str(k[-1]))
					i +=1
				else: break;
		except:
			return -1
			
			 

from heapq import *
class cacheManager:
	def __init__(self):
		self.h = []
	def add_url(self,k,v):
		try:
			heappush(self.h,(k,v))
		except IndexError:
			return -1
	def print_url(self,out):
		try:
			if len(self.h) > out:
				for n in range(out):
					heappop(self.h)
					
			else:
				print("Insufficient URLS")
				return -1
		except IndexError:
			return -1
	def print_url2(self,out):
		try:
			for n in range(out):
				url = heappop(self.h)
				heappush(self.h,(len(self.h) + 1,url))
				print(url)
		except IndexError:
			return -1
	def pop_url(self):
		try:
			return heappop(self.h)
		except IndexError:
			return -1
		

from queue import PriorityQueue

class pq:
	def __init__(self,size=0):
		self.size=size
		self.count = 1
		self.pq = PriorityQueue(self.size)
	def set(self,t,p):
		try:
			self.pq.put((int(p),self.count,str(t)))
			self.count += 1
		except IndexError:
			return -1
	def get(self,p):
		try:
			if self.pq.qsize() > 0:
				return self.pq.get(p)
		except:
			return -1
			
## Without any predefined funtions 

class pqueue:
	def __init__(self,size):
		self.size = size
		self.cache = {}
		self.count = 0
	def set(self,i,p):
		self.cache[(self.count,i)] = p
		self.count += 1
	#def get(self,p):
#		self.cache
	def print_100(self,c):
		if c < len(self.cache):
			i = 1
			for k,v in sorted(self.cache.items(),key=lambda x:x[0]):
				if i <= c: print(str(k[-1]))
				else: break;
				i += 1
					
				
				
		
		
		
		
		
			
			
			
