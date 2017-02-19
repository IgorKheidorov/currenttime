using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Checker
    {
        internal string checkExp(Calculator calculator)
        {
            foreach (char c in calculator.exp)
            {
                if (!Char.IsDigit(c) && c != '+' && c != '-' && c != '*' && c != '/'
                    && c != '(' && c != ')' && c != '.' && c != ' ')
                {
                    calculator.exp = "";
                    Console.WriteLine("MESSAGE INCORRENT SYMBOLS");
                    break;
                }
            }
            return calculator.exp;
        }

    }
}
