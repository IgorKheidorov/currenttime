namespace People
{
    class Checker
    {
        public bool isNameCorrect(string name)
        {
            if (name == "")
            {
                return false;
            }
            foreach (var item in name)
            {
                if (char.IsNumber(item))
                {
                    return false;
                }
            }
            return true;
        }

        public bool isSexCorrect(string sex)
        {
            if (sex == "male" || sex == "MALE" || sex == "female" || sex == "FEMALE")
                return true;
            else
                return false;
        }

        public bool isAgeCorrect(int age)
        {
            if (age >= 0 && age <= 100)
                return true;
            else
                return false;
        }
    }
}
