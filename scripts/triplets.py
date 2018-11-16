#triplets
for i in range(0,len(a)-2):
	for j in range(i+1,len(a)-1):
		for k in range(j+1,len(a)):
			if(a[i]+a[j]+a[k] == n):
				print(a[i],a[j],a[k])

for i in range(0,len(a)-2):
	j = i+1
	r = len(a)-1
	while(j < r):
		if(a[i] + a[j] + a[r] == n): print(a[i],a[j],a[k]); break
		elif(a[i] + a[j] + a[r] < n): j +=1
		else: r -= 1
	