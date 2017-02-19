using System;

namespace Frequency
{
    /// <summary>
    /// Reading text from console
    /// </summary>
    class Inputer
    {
        private string text = "";
        public string InputString()
        {
            Console.WriteLine("Input text:");
            text = Console.ReadLine();
            return text;
        }
    }      
}
