using System;
using System.Collections.Generic;
using System.Linq;

namespace People
{
    class AverageAgeSearcher
    {
        public float averageAge(List<Person> personsList)
        {
            return personsList.Sum(person => person.getMyAge()) / personsList.Count;
        }
    }
}
