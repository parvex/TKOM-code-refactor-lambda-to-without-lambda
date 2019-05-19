using System.IO;
using Antlr4.Runtime;

namespace LambdaRemover
{

    public class SyntaxError
    {
        public TextWriter Output { get; }
        public IRecognizer Recognizer { get; }
        public IToken OffendingSymbol { get; }
        public int Line { get; }
        public int CharPositionInLine { get; }
        public string Message { get; }
        public RecognitionException Exception { get; }

        public string AsString()
        {
            return "Line: " + Line + ":" + CharPositionInLine + " Message: " + Message;
        }

        public SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string message, RecognitionException exception)
        {
            Output = output;
            Recognizer = recognizer;
            OffendingSymbol = offendingSymbol;
            Line = line;
            CharPositionInLine = charPositionInLine;
            Message = message;
            Exception = exception;
        }
    }
}
