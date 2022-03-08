package module;

import bootstrap.DataLoader;

public class Processor {

    DataLoader load = new DataLoader();

    public void run() {

        load.loadTestData();
    }
}
