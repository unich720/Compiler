using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;

namespace Compiler
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            //string input = "int i;";
            //ICharStream stream = CharStreams.fromString(input);

            ICharStream stream = CharStreams.fromPath(@"C:\\GitHub\\Compiler\\Compiler\\ANTLR\\csharp\\test.txt");

            ITokenSource lexer = new pikeLexer(stream);
            ITokenStream tokens= new CommonTokenStream(lexer);
            var parser = new pikeParser(tokens);
            //parser.BuildParseTree = true;
            //parser.AddParseListener(new pikeBaseListener());
            var asd = parser.program();
            
            //IParseTree tree = 
        }
    }
}
