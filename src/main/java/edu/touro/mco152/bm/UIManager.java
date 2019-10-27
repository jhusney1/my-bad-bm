package edu.touro.mco152.bm;

public interface UIManager {

    final boolean hasBeenCancelled = false;

    public void setMarkNumber(int markNumber);

    void setProgress(int progress);
    public void setBwMbSec(double bwMbSec);
    String getBwMbSecAsString();
    void publish(@NotNull V... chunks);
    public double getCumMax();
    public double getCumMin();
    public double getCumAvg();
    DiskMark.MarkType type = null;


}
