package entity;

public class healt {
    private double maxHP;
    private double currentHP;

    public healt(double maxHP, double currentHP){
        this.maxHP = maxHP;
        this.currentHP = currentHP;
    }
    public double getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(double maxHP) {
        this.maxHP = maxHP;
    }

    public double getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(double currentHP) {
        this.currentHP = currentHP;
    }
}
