package app.sensors;

import app.entyties.Indicator;
import app.entyties.Substance;

public class ColorSensor extends Sensor {

    public ColorSensor(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Color: "
                + Indicator.indicateColor(substance.getState()));
    }
}
