package rooms;

public class TreasureRoom extends Room {

    private int visibleTreasure;
    private int obscuredTreasure;

    public TreasureRoom(double lightLevel, int visibleTreasure, int obscuredTreasure ){
        super(lightLevel);
        this.visibleTreasure = visibleTreasure;
        this.obscuredTreasure = obscuredTreasure;
    }


    public int allowToCollectVisibleTreasure(){
        return this.visibleTreasure;
    }

    public int allowToCollectObscuredTreasure(){
        return this.obscuredTreasure;
    }

    public int allowToCollectTreasure(){
        int allTreasure = allowToCollectVisibleTreasure();
        if(lightLevel >= 1.0) {
            allTreasure += allowToCollectObscuredTreasure();
            }
        return allTreasure;
    }


    public void setVisibleTreasure(int visibleTreasure) {
        this.visibleTreasure = visibleTreasure;
    }

    public void setObscuredTreasure(int obscuredTreasure) {
        this.obscuredTreasure = obscuredTreasure;
    }
}
