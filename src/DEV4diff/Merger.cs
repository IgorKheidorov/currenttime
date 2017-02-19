using System;
using System.Collections;
using System.Text;

namespace Frequency
{
    /// <summary>
    /// Class to gather strings
    /// </summary>
    class Merger
    {
        private string curretnText;
        private ArrayList partsOfText = new ArrayList();
        
        private void MergeText ()
        {
            partsOfText.Add(0, currentText);
            if (partsOfText > 1)
            {
                for (int i = 1; i < partsOfText.Size(); i++)
                {
                    currentText = new StringBuilder(partsOfText.get(i) + " ").Append(currentText).ToString();
                }
            }
        }

        public string Merge(string newText)
        {
            currentText = newText;
            MergeText();
            Console.WriteLine(currentText);
            return currentText;
        }
    }
}
