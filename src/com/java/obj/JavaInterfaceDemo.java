package com.java.obj;

public class JavaInterfaceDemo implements JavaInterface {
    public static void main(String[] args) {
        System.out.println("接口");

        JavaInterfaceDemo j =new JavaInterfaceDemo();
        j.eat();
        j.travel();
    }

    @Override
    public void eat() {
        System.out.println("大鸭梨吃金牌烤鸭！");
    }

    @Override
    public void travel() {
        System.out.println("海南三亚三日游！");
    }
}
interface Sports{
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}
interface Football extends Sports{
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
}
interface Hockey extends Sports{
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}
interface Event{
    public void move();
}
interface robbot extends Event,Sports{

}