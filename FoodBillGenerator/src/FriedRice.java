public class FriedRice {
    private int price;
    private Boolean vegitable;

    private int extraEggOmeletPrice = 100;
    private int extraPortionPrice = 150;
    private int BackPackPrice = 10;

    private int baseFriedRicePrice;

    private boolean isExtraEggOmeletAdded = false;
    private boolean isExtraPortionAdded = false;
    private boolean isOptedForTakeAway = false;

    public FriedRice(Boolean vegitable) {
        this.vegitable = vegitable;
        if(this.vegitable){
            this.price = 300;
        }else{
            this.price = 400;
        }
        baseFriedRicePrice = this.price;
    }

    public void addEggOmelet(){
        isExtraEggOmeletAdded = true;
        this.price += extraEggOmeletPrice;
    }

    public void addExtraPortion(){
        isExtraPortionAdded = true;
        this.price += extraPortionPrice;
    }

    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += BackPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Fried Rice : "+baseFriedRicePrice);
        if(isExtraEggOmeletAdded){
            bill += "Extra Egg Omelet added : "+extraEggOmeletPrice+ "\n";
        }
        if(isExtraPortionAdded){
            bill += "Extra Portion added : "+extraPortionPrice+ "\n";
        }
        if(isOptedForTakeAway){
            bill += "Take away : "+BackPackPrice+ "\n";
        }
        bill += "Bill: "+this.price + "\n";
        System.out.println(bill);
    }
}
