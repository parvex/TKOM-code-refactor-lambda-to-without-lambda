using System.IO;
using System.Windows.Controls;
using Antlr4.Runtime;

namespace LambdaRemover
{
    public class ParserErrorListener : BaseErrorListener
    {
        private readonly TextBlock _logOutput;

        public ParserErrorListener(TextBlock logOutput)
        {
            this._logOutput = logOutput;
        }

        public void SyntaxError(TextWriter output, IRecognizer recognizer, int offendingSymbol, int line,
            int charPositionInLine,
            string msg, RecognitionException e)
        {
            _logOutput.Text = _logOutput.Text + "\n" + msg;
        }
    }
}