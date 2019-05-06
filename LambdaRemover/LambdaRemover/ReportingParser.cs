using System;
using System.IO;
using System.Windows.Controls;
using Antlr4.Runtime;

namespace LambdaRemover
{
    public class ReportingParser : CsharpSubsetParser
    {
        private readonly TextBlock _logOutput;

        public ReportingParser(ITokenStream input, TextBlock logOutput) : base(input)
        {
            _logOutput = logOutput;
        }

        public ReportingParser(ITokenStream input, TextWriter output, TextWriter errorOutput) : base(input, output, errorOutput)
        {   
        }
        //public void emitErrorMessage(string msg)
        //{
        //    _logOutput.Text = _logOutput.Text + "\n" + msg;
        //}
    }
}