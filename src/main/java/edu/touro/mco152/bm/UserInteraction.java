package edu.touro.mco152.bm;

import com.sun.istack.internal.NotNull;

import java.util.List;

public interface UserInteraction <T,V> {

    void processor(@NotNull List<DiskMark> markList);

    void finished();

    boolean hasBeenCancelled();

    void setTheProgress(int progress);

    void publisher(@NotNull V... chunks);
}
