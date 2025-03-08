public class SpecialFriedRice extends FriedRice{

    public SpecialFriedRice(Boolean vegitable) {
        super(vegitable);
        super.addEggOmelet();
        super.addExtraPortion();
    }

    @Override
    public void addEggOmelet() {}

    @Override
    public void addExtraPortion() {}
}
