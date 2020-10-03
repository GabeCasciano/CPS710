HL.class: HL.jj TestHL.java Token.java
	javacc HL.jj
	javac  *.java
Token.java: HL.jj
	javacc HL.jj
