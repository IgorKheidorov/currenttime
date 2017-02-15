using System;
using System.Collections.Generic;

namespace People
{
    class Program
    {
        private static void printAverageAge(List<Person> personsList)
        {
            AverageAgeSearcher counter = new AverageAgeSearcher();
            Console.WriteLine("Average age: " + counter.averageAge(personsList));
        }


        private static void printOldestUsers(List<Person> personsList, ConsoleWriter consoleWriter)
        {
            OldestPerson oldestPerson = new OldestPerson();
            Console.WriteLine("User with max age:");
            consoleWriter.outputPersonsList(oldestPerson.getOldestUser(personsList)); 
        }


        private static void printMostPopularWomanName(List<Person> personsList)
        {
            TheMostPopularWomanName mostPopularWomanNameSearcher = new TheMostPopularWomanName();
            Console.WriteLine("Most popular woman name: " + mostPopularWomanNameSearcher.findMostPopularWomanName(personsList));
        }


        private static void printHomonyms(List<Person> usersList, ConsoleWriter consoleWriter)
        {
            SameSurname sameSurname = new SameSurname();
            Console.WriteLine("Same surnames: ");
            consoleWriter.outputPersonsList(sameSurname.searchSurname(usersList));
        }


        static void Main(string[] args) //entry point in programm
        {
            ConsoleReader consoleReader = new ConsoleReader();
            ConsoleWriter consoleWriter = new ConsoleWriter();
            Checker checker = new Checker();
            List<Person> personsList = consoleReader.inputPersonsList(checker);
            printAverageAge(personsList);
            printOldestUsers(personsList, consoleWriter);
            printMostPopularWomanName(personsList);
            printHomonyms(personsList, consoleWriter);
            Console.ReadKey();
        }
    }
}
