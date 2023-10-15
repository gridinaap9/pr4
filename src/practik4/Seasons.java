package practik4;

public enum Seasons {
    Spring(12),
    Summer(24),
    Autumn(10),
    Winter(-5);
    private final int Temperature;
    Seasons(int temp) {
        Temperature = temp;    }
    public  int getTemperature(){
        return Temperature;
    }    public  String getDescription(){
        if (Temperature == 24){
            return "Теплое время года";}
        else{
            return "Холодное время года";}
    }
}
