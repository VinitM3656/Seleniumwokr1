package JavaExclerRevision;

public class ConstPara27 {
    int year;
    String Name;

    public ConstPara27(int year, String Name) {
        this.year = year;//   added paramtere
        this.Name = Name;
    }

    public static void main(String[] args) {
        ConstPara27 mycar = new ConstPara27(2022, "bajaj");
        System.out.println(mycar.year + " " + mycar.Name);
    }
}
