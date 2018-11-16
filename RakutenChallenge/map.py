import sys
def mapper():
    for line in sys.stdin:
        line = line.strip()
        (i,j,value) = line.split(",")
        print '%s\t%s' % (str(0),((i,j),value))
mapper()
