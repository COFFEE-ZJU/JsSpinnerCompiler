@doskey antlr4=java org.antlr.v4.Tool $*
@doskey grun =java org.antlr.v4.runtime.misc.TestRig $*
@java org.antlr.v4.Tool -no-listener -visitor JaqlGrammar.g4
