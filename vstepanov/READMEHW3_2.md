# Homework after lesson 3 (13/04/2017)
javac -d out src/SecondHW3.java 
src/SecondHW3.java:1: **error**: :sparkles: '{' expected
	public class SecondHW3.java {
               ^
**1 error** :sparkles:
* javac -d out src/SecondHW3 java
* javac: invalid flag: src/SecondHW3
* Usage: javac <options> <source files>
* use -help for a list of possible options
###### javac -d out src/SecondHW3.java
src/SecondHW3.java:1: error: '{' expected
 	public class SecondHW3.java {
                      ^
**1 error** :sparkles:
```
# :+1: * 1 command: javac -d out src/SecondHW3.java
```
##### java -cp out SecondHW3.java 
- [ ] Error:
- [x] Could not find or load main class SecondHW3.java
```
```
## :+1: * 2 command: java -cp out SecondHW3
>*Second attempt of HW3*
```
```
### :+1: * 3 command: jar -cvf app.jar out
* **added manifest**
* <del>adding: out/(in = 0) (out= 0)(stored 0%)</del>
* **adding: out/SecondHW3.class(in = 433) (out= 296)(deflated 31%)**

#### :+1: * 4 command:  jar -cvf app.jar -C out/ .
> *added manifest* 
> *adding: SecondHW3.class(in = 433) (out= 296)(deflated 31%)*

##### :+1: * 5 command: java -jar app.jar
no main manifest attribute, in app.jar



