public class programmer {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(this.salary < salary) {
            this.salary = salary;
        }
    }
}
