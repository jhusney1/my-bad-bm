package edu.touro.mco152.bm;

import javax.swing.*;
import java.util.List;

public class SwingInteraction extends SwingWorker implements UserInteraction {

    public static SwingInteraction si;
    public static DiskWorker d;

    @Override
    public Boolean doInBackground() throws Exception {
        return (boolean) d.backgroundWork();
    }

    @Override
    public boolean hasBeenCancelled() {
        return si.isCancelled();
    }

    @Override
    public void setTheProgress(int progress) {
        si.setProgress(progress);

    }

    @Override
    public void publisher(Object[] chunks) {
        si.publish();
    }

    @Override
    public void processor(List list) {
        d.process(list);
    }

    @Override
    public void finished() {
        d.done();
    }


}
