#!/usr/bin/python27
import sys

def isDigit(x):
    try:
        float(x)
        return True
    except ValueError:
        return False
def lookup_dict(dictList, **kw):
    result=[]
    print("You have searched :"+str(kw))
    priceRange={'<10': range(0,10),'[10,30]': range(10,30),'[30,50]' : range(30,50),'[50,100]': range(50,100),'[100,200]': range(100,200),'[200,500]': range(200,500),'>=500' : range(500,1000)}
    for row in dictList:
        flags=[]
        try:
            for k,v in kw.iteritems():
                if isDigit(str(row[k])):
                    if int(row[k]) in priceRange[str(v)]: flags.append(True)
                    else:flags.append(False)
                elif row[k] != str(v): break;
                else:flags.append(True)
            if False not in flags and flags.count(True) == len(kw.keys()):result.append(row)
        except KeyError,e:
            print("Wrong input")
    return result

jsonDict=[{'uuid': '4a27d12c-3eca-4459-aba5-887ce8c11fa4','neckline':'round', 'colou r':'white', 'sleeve_length': 'elbow', 'pattern': 'grid', 'price': 25.98, 'brand': 'Adidas'},{'uuid': '4a27d12c-3eca-4459-aba5-887ce8c11fa4','neckline':'round', 'colour':'white', 'sleeve_length': 'elbow', 'pattern': 'Streak', 'price': 25.98, 'brand': 'Levis'},{'uuid': '4a27d12c-3eca-4459-aba5-887ce8c11fa4','neckline':'round', 'colour':'white', 'sleeve_length': 'elbow', 'pattern': 'grid', 'price': 25.98, 'brand': 'Levis'},{'uuid': '4a27d12c-3eca-4459-aba5-887ce8c11fa4','neckline':'round', 'colour':'white', 'sleeve_length': 'elbow', 'pattern': 'grid', 'price': 12.98, 'brand': 'Levis'}]
print(lookup_dict(jsonDict, brand='Levis',neckline='round'))
print(lookup_dict(jsonDict,price='[10,30]'))