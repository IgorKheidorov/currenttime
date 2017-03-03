namespace People
{
    class Person
    {
        private string name;
        private string surname;
        private string sex;
        private int age;

        public Person()
        {
        }
        public Person (string myname, string mysurname, string mysex, string myage)
        {
            name = myname;
            surname = mysurname;
            sex = mysex;
            age = int.Parse(myage);
        }
        public void setMyName(string name)
        {
            this.name = name;
        }

        public void setMySurname(string surname)
        {
            this.surname = surname;
        }

        public void setMySex(string sex)
        {
            this.sex = sex;
        }

        public void setMyAge(int age)
        {
            this.age = age;
        }

        public string getMyName()
        {
            return name;
        }

        public string getMySurname()
        {
            return surname;
        }

        public string getMySex()
        {
            return sex;
        }

        public int getMyAge()
        {
            return age;
        }
    }
}
