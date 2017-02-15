using System.Collections.Generic;
using System.Linq;

namespace People
{
    class OldestPerson
    {
        public List<Person> getOldestUser(List<Person> personsList)
        {
            int max = personsList.Max(user => user.getMyAge());
            return personsList.Where(person => person.getMyAge() == max).ToList<Person>();
        }

    }
}
