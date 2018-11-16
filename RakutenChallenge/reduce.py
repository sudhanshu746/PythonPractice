import sys
from ast import literal_eval
from itertools import product

def neighbours(cell,size):
    for c in product(*(range(n-1, n+2) for n in cell)):
        if c != cell and all(0 <= n < size for n in c):
            yield c
def reducer():
    hashmap={}
    current_key=None
    for line in sys.stdin:
        line = line.strip()
        (key,value) = line.split('\t',1)
	mapkey = str(tuple(map(lambda l:int(l),literal_eval(value)[0])))
	mapvalue=int(literal_eval(value)[1])
	if current_key == key:hashmap[mapkey] = mapvalue
	else: 
		current_key=key	
    if current_key == key:
	shortmap={}
	size=0
	cells=()
	for k,v in hashmap.items():
		keval = literal_eval(k)
		cells += (tuple(literal_eval(k)),)
		if keval[0] in shortmap:
			shortmap[keval[0]].append(keval[1]); 	
			if size < len(shortmap[keval[0]]): size= len(shortmap[keval[0]])
		else: shortmap[keval[0]] = [keval[1]]
	for cell in cells:
		countOne=0
		for j in list(neighbours(cell,size)):
			try:
				if hashmap[str(j)] == 1: countOne += 1
			except KeyError,e:
				pass
		# if count Even
		if countOne%2 == 0: 
			print("%s\t%s"%(cell,1))	
		else: print("%s\t%s"%(cell,0))
	
reducer()
