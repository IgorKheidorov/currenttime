class DayOfWeek
{
  String day = new String();

  String getShort(int dayNumber) {
    switch (dayNumber) {
      case 2: day = "Mon";
              break;
      case 3: day = "Tue";
              break;
      case 4: day = "Wen";
              break;
      case 5: day = "Thu";
              break;
      case 6: day = "Fri";
              break;
      case 7: day = "Sat";
              break;
      case 1: day = "Sun";
              break;
    }

    return day;
  }

  String getFull(int dayNumber) {
    switch(dayNumber) {
      case 2: day = "Monday";
              break;
      case 3: day = "Tuesday";
              break;
      case 4: day = "Wednesday";
              break;
      case 5: day = "Thursday";
              break;
      case 6: day = "Friday";
              break;
      case 7: day = "Saturday";
              break;
      case 1: day = "Sunday";
              break;
    }

    return day;
  }
}