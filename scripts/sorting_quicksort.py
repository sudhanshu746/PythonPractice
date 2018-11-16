
# sorting_quicksort.py

# Quicksort fast sorting algorithm based upon divide-and-conquer to sort list
# Used for file search, data compression, and path findings
# Complexity : Best,Average O(n log n) worst O(n^2)
import random
class sorting():
	def __init__(self,lst=[]):
		self.arr = lst
	def printList(self):
		print(self.arr)
	#Function used for partition 
	def quick_partition(arr,low,high):
		sIndex = (low -1)
		pivot = arr[high]
		for e in range(low,high):
			if arr[sIndex] <= pivot:
				sIndex = sIndex + 1
				arr[sIndex],arr[e] = arr[e],arr[sIndex]
		arr[sIndex+1],arr[high] = arr[high], arr[sIndex+1]
		return (sIndex + 1)	
	def quickSort(self,low,high):
		if low < high:
			partition_index = quick_partition(self.arr,low,high)
			quickSort(self.arr,low,partition_index - 1)
			quickSort(self.arr,partition_index + 1, high)
		