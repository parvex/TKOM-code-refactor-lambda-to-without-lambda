using System;
using System.Collections.Generic;
using System.IO;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using LambdaRemover;

public class SyntaxErrorListener : BaseErrorListener
{
    public List<SyntaxError> SyntaxErrors = new List<SyntaxError>();

    public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, 
        int line, int charPositionInLine, string msg, RecognitionException e)
    {
            SyntaxErrors.Add(new SyntaxError(output, recognizer, offendingSymbol, line, charPositionInLine, msg, e));
    }
}