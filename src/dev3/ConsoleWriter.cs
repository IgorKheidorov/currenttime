using System;
using System.Collections.Generic;

namespace People
{
    class ConsoleWriter
    {
        public void outputPerson(Person person)
        {
            Console.WriteLine("Name: " + person.getMyName());
            Console.WriteLine("Surname: " + person.getMySurname());
            Console.WriteLine("Gender: " + person.getMySex());
            Console.WriteLine("Age: " + person.getMyAge());
        }
        public void outputPersonsList(List<Person> personsList)
        {
            foreach (Person person in personsList)
            {
                outputPerson(person);
            }
        }
    }
}
