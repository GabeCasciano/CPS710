echo "----- Test $1"
java -classpath . TestHL ../Test/$1.hl >../Test/$1.out
diff -b ../Test/$1.out ../Test/$1.results
