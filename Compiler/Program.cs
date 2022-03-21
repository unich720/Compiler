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

            string input = "4+5";
            ICharStream stream = CharStreams.fromString(input);
            ITokenSource lexer = new CompilerLexer(stream);
            ITokenStream tokens= new CommonTokenStream(lexer);
            CompilerParser parser = new CompilerParser(tokens);
            parser.BuildParseTree = true;
            //IParseTree tree = 
        }
    }
}
