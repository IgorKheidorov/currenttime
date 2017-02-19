using System.Collections.Generic;
using System.Linq;

namespace People
{
    class TheMostPopularWomanName
    {
        public string findMostPopularWomanName(List<Person> personsList)
        {
            List<Person> females = personsList.Where(person => person.getMySex() == "female").ToList();
            return personsList.GroupBy(person => person.getMyName()).OrderBy(person => person.Count()).Last().Key;
        }
    }
}
