using System;
using System.Collections.Generic;
using System.IO;

namespace DEV_9
{
    /// <summary>
    /// The class is looking for data in the .ini file specified by sections and key
    /// </summary>
    class Searcher
    {
        /// <summary>
        /// Find section in file, find values by key and add them in list
        /// </summary>
        /// <param name="path"></param>
        /// <param name="section"></param>
        /// <param name="key"></param>
        /// <returns></returns>
        public List<string> SearchInFile(string path, string section, string key)
        {
            List<string> result = new List<string>();
            string value = string.Empty;
            try
            {
                using (StreamReader streamReader = new StreamReader(path))
                {
                    value = streamReader.ReadLine();
                    while (value != null)
                    {
                        if (string.Compare(value, section) == 0)
                        {
                            List<string> resultInSection = SearchInSection(key);
                            if (resultInSection != null)
                            {
                                result.AddRange(resultInSection);
                            }
                        }
                    }
                }
            }
            catch(FileNotFoundException )
            {
                //string massage = ex.Massage();
                Console.WriteLine("Incorrect path to file!");
            }
            catch(Exception)
            {
                Console.WriteLine("Incorrect path to file!");
            }
            return result;
        }
        /// <summary>
        /// Method looking for keys in section and add they values in list;
        /// </summary>
        /// <param name="key"></param>
        /// <returns></returns>
        public List<string> SearchInSection(string key)
        {
            StreamReader streamReader = new StreamReader(key);
            List<string> resultInSection = new List<string>();
            string value = string.Empty;
            string keyChecker = value.Substring(0, key.Length);
            value = streamReader.ReadLine();
            while (value != string.Empty)
            {
                if (value == null)
                {
                    break;
                }
                if (value.Contains(key) && string.Compare(keyChecker, key) == 0)
                {
                    resultInSection.Add(keyChecker);
                }
            }
            return resultInSection;
        }
    }
}
