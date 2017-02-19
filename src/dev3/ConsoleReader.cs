using System;
using System.Collections.Generic;

namespace People
{
    class ConsoleReader //received data from console

    {
        private string inputName(Checker checker)
        {
            string p;
            do
            {
                Console.WriteLine("Input name(only letters are allowed)");
                p = Console.ReadLine();
            }
            while (!checker.isNameCorrect(p));
            return p;
        }


        private string inputSurname(Checker checker)
        {
            string p;
            do
            {
                Console.WriteLine("Input surname(only letters are allowed)");
                p = Console.ReadLine();
            }
            while (!checker.isNameCorrect(p));
            return p;
        }


        private string inputGender(Checker checker)
        {
            string p;
            do
            {
                Console.WriteLine("Input sex(only male or female are allowed)");
                p = Console.ReadLine();
            }
            while (!checker.isSexCorrect(p));
            return p;
        }


        private int inputAge(Checker checker)
        {
            string p;
            do
            {
                Console.WriteLine("Input age(only number beetween 0 and 100 are allowed)");
                p = Console.ReadLine();
            }
            while (!checker.isAgeCorrect(int.Parse(p))); 
            return int.Parse(p);
        }


        private Person inputUser(Checker checker)
        {
            Person user = new Person();
            user.setMyName(inputName(checker));
            user.setMySurname(inputSurname(checker));
            user.setMySex(inputGender(checker));
            user.setMyAge(inputAge(checker));
            return user;
        }


        public List<Person> inputPersonsList(Checker checker)
        {
            List<Person> personsList = new List<Person>();
            string answer;
            do
            {
                personsList.Add(inputUser(checker));
                Console.WriteLine("To finish the input type 'exit', else type any key");
                answer = Console.ReadLine();
            } while (answer != "exit");
            return personsList;
        }
    }
}
