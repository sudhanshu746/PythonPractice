'''
An integer P is a whole square if it is a square of some integer Q; i.e if p = q^2
write a function:
	class solution { public int solution(int A, int B);}
that, given two integer A and B returns number of whole square within interval[A..B](both ends included)
'''
from math import sqrt
class solution:
	def __init__(self,a,b):
		self.a = a
		self.b = b
	def solution(self):
		sq=[]
		if self.a >= self.b: return None 
		for n in range(2,self.b):
			if sqrt(n).is_integer():
				sq.append(n)
		return len(sq)

obj = solution(4,17)
print(obj.solution())
