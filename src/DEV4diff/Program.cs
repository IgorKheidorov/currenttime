using System;

namespace Frequency
{
    class Program
    {
        /// <summary>
        /// Entry point in programm
        /// uses infinity cycle
        /// after 3 iterations could be interrupted
        /// </summary>
        static void Main(string[] args)
        {
            int operationCounter = 0;
            string receivedText;
            Inputer inputer = new Inputer();
            Merger merger = new Frequency.Merger();
            Outputer outputer = new Outputer();

            while(operationCounter <= 3)
            {
                operationCounter++;
                receivedText = inputer.InputString();
                receivedText = merger.Merge(receivedText);
                Parser parser = new Parser(receivedText);

                if ( receivedText.Equals("exit", StringComparison.InvariantCultureIgnoreCase))
                {
                    break;
                }
                else
                {
                    outputer.printInConsole(new FrequencyCounter(parser.Parsetext()));
                    Console.WriteLine("Words with over 5 letters: ");
                    outputer.printInConsole(new WordsCounter(parser.Parsetext()));
                }
                Console.WriteLine("After 3 types you can type \"exit\" to stop the program.");
            }
        }
}
