package circus.stuff;

import circus.Asset;

public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() { // if it is named differently, will not compile (must implement methods in interface)
        return purchasePrice;
    }
}
