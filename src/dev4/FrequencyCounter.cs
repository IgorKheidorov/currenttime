using System;
using System.Collections;
using System.Collections.Generic;

namespace Frequency
{
    class FrequencyCounter
    {
        private double one = 1.0;

        private ArrayList listOfWords = new ArrayList();
        private Dictionary<int, string> frequency = new Dictionary<int, string>();
        private int wholePairCounter = 0;

        public FrequencyCounter(ArrayList list)
        {
            listOfWords = list;
        }

        protected void calculate()
        {
            foreach (string word in listOfWords)
            {
                for (int i = 1; i < word.Length; i++)
                {
                    String twoChars = word.Substring(i - 1, i + 1).ToLower();
                    char[] pairOfChars = twoChars.ToCharArray();
                    if ((((pairOfChars[0] <= 'z') && (pairOfChars[0] >= 'a')) && (((pairOfChars[1] <= 'z') &&
                        (pairOfChars[1] >= 'a')))))
                    {
                        if (frequency.ContainsKey(twoChars))
                        {
                            frequency.Add(twoChars, (frequency.(twoChars) + one) / wholePairCounter);
                        }
                        else
                        {
                            frequency.Add(twoChars, (one / wholePairCounter));
                        }
                    }
                }
            }
            Console.WriteLine(wholePairCounter);
        }
    }
}
