
# sorting_quicksort.py

# Quicksort fast sorting algorithm based upon divide-and-conquer to sort list
# Used for file search, data compression, and path findings
# Complexity : Best,Average O(n log n) worst O(n^2)
import random
class sorting():
	def __init__(self,inputList=[]):
		self.inputList = inputList
	def printList(self):
		print(self.inputList)
	#Quick Partition Function 1) takes last element as pivot, 2)place pivot element at its position 3) place all smaller to left of pivot and all greater to the right.
	def quick_partition(self,low,high):
		sIndex = (low -1)
		pivot = self.inputList[high]
		print(pivot)
		for e in range(low,high):
			if self.inputList[sIndex] <= pivot:
				sIndex = sIndex + 1
				self.inputList[sIndex],self.inputList[e] = self.inputList[e],self.inputList[sIndex]
		self.inputList[sIndex+1],self.inputList[high] = self.inputList[high], self.inputList[sIndex+1]
		return (sIndex + 1)	
	def quickSort(self,low=0,high=0):
		if low < high:
			partition_index = self.quick_partition(low,high)
			self.quickSort(low,partition_index - 1)
			self.quickSort(partition_index + 1, high)
	def bubbleSort(self):
		for i in range(0,len(self.inputList)-1):
			for j in range(0,len(self.inputList)-i-1):
				if( self.inputList[i] > self.inputList[j]):
					self.inputList[i],self.inputList[j] = self.inputList[j],self.inputList[i]
					
	def InsertSort(self):
		for slot in range(0,len(self.inputList)-1):
			value = self.inputList[slot]
			test_slot = slot-1
			while(test_slot > -1 and self.inputList[test_slot] > value):
				self.inputList[test_slot + 1] = self.inputList[test_slot]
				test_slot = test_slot - 1
			self.inputList[test_slot + 1] = value

	#def binaryInsertSort()
	def merge(self,left,right):
		if not len(left) or not len(right):
			return left or right
		result = []
		i,j = 0,0
		while(len(result) < len(left) + len(right)):
			print(left[i],right[j])
			if int(left[i]) < int(right[j]):
				result.append(int(left[i]))
				i+=1
			else:
				result.append(int(right[j]))
				j+=1
			if i == len(left) or j == len(right):
				result.append(left[i:] or right[j:])
				break
		return result

	def mergeSortRecursive(self,inputList):
		if len(inputList) < 2:
			return inputList
		mid = int(len(inputList)/2)
		left = self.mergeSortRecursive(inputList[:mid])
		right = self.mergeSortRecursive(inputList[mid:])
		#print(right,left)
		return self.merge(left,right)
	def mergeSort(self):
		return self.mergeSortRecursive(self.inputList)
		
	
			
			
		