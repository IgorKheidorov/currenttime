using System;
using System.Collections.Generic;

namespace DEV_9
{
    /// <summary>
    /// Entry point in program.
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Inputer inputer = new DEV_9.Inputer();

            string section = string.Empty;
            section = inputer.InputAndTrimSection();

            string key = string.Empty;
            key = inputer.InputAndTrimKey();

            string path = string.Empty;
            path = inputer.InputAndTrimPath();

            Searcher searcher = new Searcher();

            if (path != null)  // Check the file path to the fullness
            {
                List<string> result = searcher.SearchInFile(section, key, path);
                foreach (var value in result)
                {
                    Console.WriteLine(value);
                }
            }
            else
            {
                Console.WriteLine("Enter correct path, please.");
            }
        }
    }
}
