using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;
using Antlr4.Runtime;

namespace LambdaRemover
{
    public class LexerErrorListener : IAntlrErrorListener<int>
    {
        private readonly TextBlock _logOutput;

        public LexerErrorListener(TextBlock logOutput)
        {
            this._logOutput = logOutput;
        }

        public void SyntaxError(TextWriter output, IRecognizer recognizer, int offendingSymbol, int line, int charPositionInLine,
            string msg, RecognitionException e)
        {
            _logOutput.Text = _logOutput.Text + "\n" + msg;
        }
    }
}

