package practice;

public class SavingAmount {

    private int saving;


    public SavingAmount() {
    }

    public int getCurrentSaving() {
        return saving;
    }

    public void setInitialSaving(int saving) {
        this.saving = saving;
    }

    public void incrementSaving() {
        saving += 1000;
    }

    public void decrementSaving() {
        saving -= 100;
    }

    public void checkSaving() {
        if (saving >= 1000) {
            System.out.println("Congratulations! You have saved a good amount");
        } else if (saving < 1000 && saving > 0) {
            System.out.println("Insufficient saving!");
        } else if (saving < 0) {
            System.out.println("You are in debt");
        }
    }
}
