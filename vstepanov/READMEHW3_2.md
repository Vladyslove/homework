	###javac -d out src/SecondHW3.java###
*src/SecondHW3.java:1: error: '{' expected*
	*public class SecondHW3.java {*
               ^
**1 error**
*javac -d out src/SecondHW3 java*
*javac: invalid flag: src/SecondHW3*
*Usage: javac <options> <source files>*
*use -help for a list of possible options*
```
```
	###javac -d out src/SecondHW3.java###
*src/SecondHW3.java:1: error: '{' expected*
*public class SecondHW3.java {*
                      ^
**1 error**
```
	#javac -d out src/SecondHW3.java#
```
```
	###java -cp out SecondHW3.java###
**Error:** *Could not find or load main class SecondHW3.java*
```
	#java -cp out SecondHW3#
Second attempt of HW3 
:+1:

```
```
# *jar -cvf app.jar out* #
## **added manifest** ##
### adding: out/(in = 0) (out= 0)(stored 0%) ###
#### adding: out/SecondHW3.class(in = 433) (out= 296)(deflated 31%) ####


