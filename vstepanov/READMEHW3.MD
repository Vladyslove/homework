vladyslav@vladyslav-VirtualBox:~$ pwd
	/home/vladyslav
vladyslav@vladyslav-VirtualBox:~$ javac -d out src/SimpleMain.java
	javac: file not found: src/SimpleMain.java
	Usage: javac <options> <source files>
	use -help for a list of possible options
vladyslav@vladyslav-VirtualBox:~$ cd simple_java_app_kata-master
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ javac -d out src/SimpleMain.java
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ java -cp out SimpleMain
	Good start
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ jar -cvf app.jar out
	added manifest
	adding: out/(in = 0) (out= 0)(stored 0%)
	adding: out/empty(in = 0) (out= 0)(stored 0%)
	adding: out/SimpleMain.class(in = 424) (out= 293)(deflated 30%)

```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ jar -cvf app.jar -C out/ .
	added manifest
	adding: empty(in = 0) (out= 0)(stored 0%)
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ java -jar app.jar
	no main manifest attribute, in app.jar
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ java -cp app.jar SimleMain
	Error: Could not find or load main class SimleMain
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ cat manifest.txt
	cat: manifest.txt: Нет такого файла или каталога
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ Main-Class: SimpleMain
	Main-Class:: команда не найдена
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ jar -cvfm app.jar manifest.txt -C out/ .
	java.io.FileNotFoundException: manifest.txt (Нет такого файла или каталога)
		at java.io.FileInputStream.open0(Native Method)
		at java.io.FileInputStream.open(FileInputStream.java:195)
		at java.io.FileInputStream.<init>(FileInputStream.java:138)
		at java.io.FileInputStream.<init>(FileInputStream.java:93)
		at sun.tools.jar.Main.run(Main.java:175)
		at sun.tools.jar.Main.main(Main.java:1288)
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ java -jar app.jar
	no main manifest attribute, in app.jar
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ touch manifest.txt
```
```sh

vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ java -jar app.jar
	no main manifest attribute, in app.jar
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ java -cp app.jar SimpleMain
	Good start
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ cat manifest.txt
	Main-Class
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ cat manifest.txt
	Main-Class: SimpleMain
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ jar -cvfm app.jar manifest.txt -C out/ .
	added manifest
	adding: empty(in = 0) (out= 0)(stored 0%)
	adding: SimpleMain.class(in = 424) (out= 293)(deflated 30%)
```
```sh
vladyslav@vladyslav-VirtualBox:~/simple_java_app_kata-master$ java -jar app.jar
	Good start


