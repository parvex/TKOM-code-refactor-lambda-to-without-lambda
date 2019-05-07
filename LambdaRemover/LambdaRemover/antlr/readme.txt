
#Gen code for use in .NET 
antlr4 -visitor -Dlanguage=CSharp CsharpSubset.g4

#Gen files to debug
antlr4 CsharpSubset.g4
javac CsharpSubset*.java

#Run debug
grun CsharpSubset program -tokens -gui
[ctr+c] [ctrl+v] [enter]
[ctrl+z] [enter]