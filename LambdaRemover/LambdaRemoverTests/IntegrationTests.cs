using System;
using System.Collections.ObjectModel;
using System.IO;
using System.Linq;
using System.Text;
using LambdaRemover;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LambdaRemoverTests
{
    [TestClass]
    public class IntegrationTests
    {
        [TestMethod]
        public void RefactorExample5()
        {
            string currentDirectory = Directory.GetCurrentDirectory();
            DirectoryInfo currentDirectoryInfo = new DirectoryInfo(currentDirectory);
            string grandParentPath = currentDirectoryInfo.Parent.Parent.FullName;
            DirectoryInfo directory = new DirectoryInfo(grandParentPath + "\\InputCode");

            foreach (var file in directory.GetFiles("*.cs"))
            {
                ObservableCollection<string> logOutput = new ObservableCollection<string>();
                var engine = new RefactorEngine(logOutput);
                string example = File.ReadAllText(file.FullName);
                string output = engine.RemoveLambdas(example); ;
                if (engine.SyntaxErrorsFound)
                {
                    StringBuilder builder = new StringBuilder();
                    foreach (var log in logOutput)
                    {
                        builder.AppendLine(log);
                    }

                    output = builder.ToString();
                }

                File.WriteAllText( grandParentPath +"\\OutputCode\\" + file.Name, output);
            }
        }
    }
}
