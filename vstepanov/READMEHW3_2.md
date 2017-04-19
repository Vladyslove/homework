####### javac -d out src/SecondHW3.java #######
*src/SecondHW3.java:1: error: '{' expected*
	*public class SecondHW3.java {*
               ^
**1 error** :sparkles:
*javac -d out src/SecondHW3 java*
*javac: invalid flag: src/SecondHW3*
*Usage: javac <options> <source files>*
* <del> use -help for a list of possible options* </del>
```
```
###### javac -d out src/SecondHW3.java ######
*src/SecondHW3.java:1: error: '{' expected*
* <del> public class SecondHW3.java </del>{*
                      ^
**1 error** :sparkles:
```
# :+1: * 1 command: javac -d out src/SecondHW3.java #
```
```
###### java -cp out SecondHW3.java ######
- [] Error: :sparkles: 
- [x] Could not find or load main class SecondHW3.java
```

# :+1: * 2 command: java -cp out SecondHW3
Second attempt of HW3 
:+1:

```
```
# :+1: * 3 command: jar -cvf app.jar out
## :rocket:added manifest
### :rocket: adding: out/(in = 0) (out= 0)(stored 0%) ###
#### :rocket:adding: out/SecondHW3.class(in = 433) (out= 296)(deflated 31%) ####

# :+1: * 4 command:  jar -cvf app.jar -C out/ .
added manifest 
adding: SecondHW3.class(in = 433) (out= 296)(deflated 31%)


