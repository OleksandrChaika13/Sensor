package app.sensors;

import app.entyties.Substance;

public abstract class Sensor {

    protected Substance substance;
    public abstract void update();
}
