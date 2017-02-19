using System;
using System.Collections.Generic;
using System.Linq;

namespace People
{
    class SameSurname
    {
        public List<Person> searchSurname(List<Person> personsList)
        {
            List<IGrouping<string, Person>> sameSurnames = personsList.GroupBy(person => person.getMySurname()).Where(person => person.Count() > 1).ToList();
            return sameSurnames.SelectMany(person => person).ToList();
        }
    }
}
