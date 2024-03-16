package Java1;

public class Holiday {
    private String name;
    private int day;
    private String month;

    // Constructor
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    // Method to compare if two holidays are in the same month
    public boolean inSameMonth(Holiday other) {
        return this.month.equals(other.month);
    }

    // Method to calculate the average day of holidays in an array
    public static double avgDate(Holiday[] holidays) {
        int totalDays = 0;
        for (Holiday holiday : holidays) {
            totalDays += holiday.day;
        }
        return (double) totalDays / holidays.length;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
}

