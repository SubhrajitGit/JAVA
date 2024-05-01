class VeichleLoan {
    long loanId;
    long loanAmount;
    double intrestRate;
    String disbursedDate;
    int period;
    int emiAmount;

    public VeichleLoan(long loanId, long loanAmount, double d, String disbursedDate, int period,
            int emiAmount) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.intrestRate = d;
        this.disbursedDate = disbursedDate;
        this.period = period;
        this.emiAmount = emiAmount;
    }
    @Override
    public String toString() {
        return "VeichleLoan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", intrestRate=" + intrestRate
                + ", disbursedDate=" + disbursedDate + ", period=" + period + ", emiAmount=" + emiAmount + "]";
    }
}

class EducationLoan {
    long loanId;
    long loanAmount;
    double intrestRate;
    String disbursedDate;
    int period;
    int emiAmount;
    public EducationLoan(long loanId, long loanAmount, double d, String disbursedDate, int period,
            int emiAmount) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.intrestRate = d;
        this.disbursedDate = disbursedDate;
        this.period = period;
        this.emiAmount = emiAmount;
    }
    @Override
    public String toString() {
        return "EducationLoan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", intrestRate=" + intrestRate
                + ", disbursedDate=" + disbursedDate + ", period=" + period + ", emiAmount=" + emiAmount + "]";
    }
    
    
}

class User {
    String userId="Subhrajit";

    public User(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + "]";
    }

    
}

public class Demo {
    public static void main(String[] args) {
        User u1 = new User("Subhrajit");
        VeichleLoan v1 = new VeichleLoan(001, 100000, 12.00,"Sep 2024" , 3, 3000);
        EducationLoan e1 = new EducationLoan(001, 100000, 12.00,"Sep 2024" , 3, 3000);
        System.out.println(u1);
        System.out.println(v1);
        System.out.println(e1);
    }
}
