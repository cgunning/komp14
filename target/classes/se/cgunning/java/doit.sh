#!/bin/sh
export CLASSPATH=".:/usr/local/lib/antlr-4.2-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.2-complete.jar'
alias grun='java org.antlr.v4.runtime.misc.TestRig'

antlr4 -visitor -no-listener $1.g4

#mv *Visitor.java visitors/