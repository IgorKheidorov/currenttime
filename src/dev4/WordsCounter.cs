using System.Collections;

namespace Frequency
{
    /// <summary>
    /// Calculating words, where number of letters is over five
    /// </summary>
    class WordsCounter : Counter 
    {
        int a = 5;
        private ArrayList listOfWords = new ArrayList();
        private int counterForFiveMoreWords = 0;
        public WordsCounter(ArrayList listOfString)
        {
            this.listOfWords = listOfString;
        }

        public int getValue()
        {
            calculate();
            return counterForFiveMoreWords;
        }

        protected void calculate()
        {
            foreach (string word in listOfWords)
            {
                if (word.Length > a)
                {
                    counterForFiveMoreWords++;
                }
            }
        }
    }
}
