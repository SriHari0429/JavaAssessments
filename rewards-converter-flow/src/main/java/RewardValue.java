class RewardValue{
    private double cashValue;
    private double milesValue;

    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue= cashValue/MILES_TO_CASH_CONVERSION_RATE   ;
    }
    public RewardValue(double milesValue,boolean isMiles){
        this.milesValue=milesValue;
        this.milesValue= milesValue*MILES_TO_CASH_CONVERSION_RATE   ;
    }
    public double getCahValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }

}
