package Java1;

public class HolidayDemo {
    public static void main(String[] args) {
        // Creating a Holiday instance
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");

        // Printing holiday details
        System.out.println("Holiday Name: " + independenceDay.getName());
        System.out.println("Day: " + independenceDay.getDay());
        System.out.println("Month: " + independenceDay.getMonth());

        // Creating another Holiday instance
        Holiday newYear = new Holiday("New Year", 1, "January");

        // Comparing if two holidays are in the same month
        System.out.println("Are " + independenceDay.getName() + " and " + newYear.getName() + " in the same month? "
                + independenceDay.inSameMonth(newYear));

        // Creating an array of holidays
        Holiday[] holidays = { independenceDay, newYear };

        // Calculating the average day of holidays in the array
        double avgDay = Holiday.avgDate(holidays);
        System.out.println("Average day of holidays: " + avgDay);
    }
}

