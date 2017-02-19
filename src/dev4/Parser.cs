using System.Collections;

namespace Frequency
{
    /// <summary>
    /// Class checks input string for valid separating and split string
    /// </summary>
    class Parser
    {
        private string textToParse;

        public Parser( string textToParse)
        {
            this.textToParse = textToParse;
        }

        public void Accentuation()
        {
            if (textToParse.Contains("_"))
            {
                textToParse.Replace("_", " ");
            }
        }
        public ArrayList Parsetext ()
        {
            Accentuation();
            string[] arrayOfString;
            arrayOfString = textToParse.Split(' ');
            ArrayList listOfString = new ArrayList();
            foreach (string line in arrayOfString)
            {
                listOfString.Add(line);
            }
            return listOfString;
        }
    }
}
