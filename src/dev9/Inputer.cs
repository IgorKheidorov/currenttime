using System;

namespace DEV_9
{
    /// <summary>
    /// Class fills the field to search
    /// </summary>
    class Inputer
    {
        public string InputAndTrimPath()
        {
            string path = string.Empty;
            Console.WriteLine("Enter the path:");
            path = Console.ReadLine();
            return path.Trim(); // Delete all spaces to safety
        }
        public string InputAndTrimSection()
        {
            string section = string.Empty;
            Console.WriteLine("Enter the section:");
            section = Console.ReadLine();
            return section.Trim();
        }
        public string InputAndTrimKey()
        {
            string key = string.Empty;
            Console.WriteLine("Enter the key:");
            key = Console.ReadLine();
            return key.Trim();
        }
    }
}
