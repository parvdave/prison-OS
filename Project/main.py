f = open("Prisoners.txt",'w')
while(True):
    data = input("Enter details of prisoner : ")
    if data=="":
        break
    f.write(data)
    f.write("\n")
f.close()
f = open("Prisoners.txt",'r')
