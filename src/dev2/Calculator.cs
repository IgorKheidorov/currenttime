using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{   
    class Calculator
    {
        public string exp; 
        public string inBrackets; 
        public void infoForUser()
        {
            Console.WriteLine("\t\t\tСonsole сalculator");
            Console.WriteLine("--------------------------------------------------------------------------------");
            Console.WriteLine("It supports the operations of addition, subtraction, multiplication and division.");
            Console.WriteLine("Priorities can be changed using the brackets");
            Console.WriteLine("The fractional part is separated by a comma.");
            Console.WriteLine("Example: Enter, for example, (2 + 8) * 2 - 100 / 25 and press Enter");
            Console.WriteLine("--------------------------------------------------------------------------------");
        }
        private bool notOperator(int j)  //true if simbol number j in line InBrackets is operator + - * or /
        {
            return inBrackets[j] != '+' && inBrackets[j] != '-' && inBrackets[j] != '*' && inBrackets[j] != '/';
        }

        private double getLeftOperand(int i)//return left operand from operator, whichthere is on i place in line InBrackets
        {
            string leftOperand = "";
            for (int j = i - 1; j >= 0; j--)
                if (notOperator(j))
                    leftOperand = inBrackets[j] + leftOperand;
                else
                    break;
            return double.Parse(leftOperand);
        }

        private double getRightOperand(int i)//return right operand from operator, whichthere is on i place in line InBrackets
        {
            string rightOperand = "";
            for (int j = i + 1; j < inBrackets.Length; j++)
                if (notOperator(j))
                    rightOperand += inBrackets[j];
                else
                    break;
            return double.Parse(rightOperand);
        }

        private void replaceExp(int i, double toThis)//it replaces the expression, which is the operator for the number i in a line InBracketson the count value ToThis
        {
            int fromI = 0;
            int toI = inBrackets.Length - 1;
            for (int j = i - 1; j >= 0; j--)
                if (notOperator(j))
                    fromI = j;
                else
                    break;
            for (int j = i + 1; j < inBrackets.Length; j++)
                if (notOperator(j))
                    toI = j;
                else
                    break;
            inBrackets = inBrackets.Replace(inBrackets.Substring(fromI, toI - fromI + 1), toThis.ToString());
        }

        private void repMD(int i)//replace multiplication or division in InBrackets line on the counted value
        {
            double MD;
            if (inBrackets[i] == '*')
                MD = getLeftOperand(i) * getRightOperand(i);
            else
                MD = getLeftOperand(i) / getRightOperand(i);
            replaceExp(i, MD);
            Calc(); //back to the Calc method - it turns out that something like a mutual recursion

        }

        private void repAS(int i) //replace the sum or difference in InBrackets line on the counted value

        {
            double addSub;
            if (inBrackets[i] == '+')
                addSub = getLeftOperand(i) + getRightOperand(i);
            else
                addSub = getLeftOperand(i) - getRightOperand(i);
            replaceExp(i, addSub);
            Calc(); 
        }

        public void Calc() //method of counting the expression in brackets
        {
            int i;
            for (i = 0; i < inBrackets.Length; i++) //primarily we consider multiplication and division
                if (inBrackets[i] == '*' || inBrackets[i] == '/')
                {
                    repMD(i); //send a character in which the operator is in the method operator repMD, he thinks the product or quotient of two operands standing around it and replace them with an answer
                    return; //output of mutual recursion
                }
            for (i = 0; i < inBrackets.Length; i++)
                if (inBrackets[i] == '+' || inBrackets[i] == '-')
                {
                    repAS(i);
                    return; 
                }
        }

        public bool findBrackets(out int numbBrack) //if the original expression have brackets, then extract the deepest of variable InBrackets and written in the variable "numbBrack" symbol number which begins with these brackets.
        {
            numbBrack = 0;
            if (exp.IndexOf('(') != -1)
            {
                int closedBracket = exp.IndexOf(')');
                int openBracket = 0;
                for (int i = closedBracket - 1; i >= 0; i--)
                    if (exp[i] == '(')
                    {
                        openBracket = i;
                        inBrackets = exp.Substring(openBracket + 1, closedBracket - openBracket - 1);
                        numbBrack = openBracket;
                        exp = exp.Remove(openBracket, closedBracket - openBracket + 1);
                        break;
                    }
                return true;
            }
            return false;
        }
    }
}
