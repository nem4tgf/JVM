package Lab6;

public class TournamentIncome extends Player implements GradeBonus{
    private double grade;
    private int rate;

    public TournamentIncome(String name, double grade, int rate) {
        super(name);
        this.grade = grade;
        this.rate = rate;
    }

    @Override
    public double calculateGradeBonus() {
        return 0;
    }

    @Override
    public String displayDetails() {
        return null;
    }

}
