# Homework after lesson 3 (13/04/2017)
@ Vladyslav Stepanov
###### javac -d out src/SecondHW3.java 
1. src/SecondHW3.java:1: **error**: :sparkles: '{'
2. expected
3.	public class SecondHW3.java {
               ^
4. **1 error** :sparkles:
###### javac -d out src/SecondHW3 java
- javac: invalid flag: src/SecondHW3:
 - Usage: javac <options> <source files>
  - use -help for a list of possible options
###### javac -d out src/SecondHW3.java
- src/SecondHW3.java:1: error: '{' expected
-	public class SecondHW3.java {
                      ^
* **1 error** :sparkles:
# :+1: *1 command: javac -d out src/SecondHW3.java
```
###### java -cp out SecondHW3.java 
- [ ] Error:
- [x] Could not find or load main class SecondHW3.java
```
## :+1: *2 command: java -cp out SecondHW3
> _Second **attempt** of HW3_
```
### :+1: *3 command: jar -cvf app.jar out
* added manifest**
* <del>adding: out/(in = 0) (out= 0)(stored 0%)</del> right string- just shown using tags 'del'
* adding: out/SecondHW3.class(in = 433) (out= 296)(deflated 31%)**
```
#### :+1: *4 command:  jar -cvf app.jar -C out/ .
* *added manifest* 
* *adding: SecondHW3.class(in = 433) (out= 296)(deflated 31%)*
```
##### :+1: *5 command: java -jar app.jar
no main manifest attribute, in app.jar
```
###### :+1: *6 command: java -cp app.jar SecondHW3
< Second attempt of HW3
```
####### :+1: *7 command:
```
###### :+1: *8 command:
```
##### :+1: *9 command:



