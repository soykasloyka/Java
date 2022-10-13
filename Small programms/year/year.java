import java.util.Calendar;

public class year {

    private int currentYear;

    public year() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        year solution = new year();
        System.out.println(solution.getCurrentYear());
    }
}
