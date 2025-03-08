public class Main {
    public static void main(String[] args) {
//    FriedRice baseFriedRice = new FriedRice(true);
//    baseFriedRice.addEggOmelet();
//    baseFriedRice.addExtraPortion();
//    baseFriedRice.takeAway();
//    baseFriedRice.getBill();

        SpecialFriedRice sfr = new SpecialFriedRice(false);
        sfr.takeAway();
        sfr.getBill();
    }
}