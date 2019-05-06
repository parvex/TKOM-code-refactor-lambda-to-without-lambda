using System.Windows.Controls;
using Antlr4.Runtime;

namespace LambdaRemover
{
    public class ErrorStrategy : DefaultErrorStrategy
    {
        private readonly TextBlock _logOutput;

        public ErrorStrategy(TextBlock logOutput)
        {
            this._logOutput = logOutput;
        }


        public override void ReportError(Parser recognizer,
            RecognitionException e)
        {
            _logOutput.Text = _logOutput.Text + "\n" + e.Message;
        }
    }
}