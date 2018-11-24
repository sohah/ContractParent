oldFile=open("test.java", "r")
newFile= open("newTest.java","w+")

newFile.write("(set-logic QF_BV)\n(set-info :smt-lib-version 2.0)\n(set-option :produce-unsat-cores true)\n")
charCount = 0;

while True:
    c = oldFile.read(1)
    if not c:
        print "End of file"
        break
    if charCount>7:
        newFile.write(c);
    charCount = charCount + 1

while True:
    c = oldFile.read(1)
    if not c:
        print "End of file"
        break
    if charCount>7:
        newFile.write(c);
    charCount = charCount + 1
    print "Read a character:", c
