using System;

namespace Frequency
{
    /// <summary>
    /// Output our values
    /// </summary>
    class Outputer
    {
           public void printInConsole(Counter counter)
        {
            Console.WriteLine(counter.getValue());
        }
    
    }
}
