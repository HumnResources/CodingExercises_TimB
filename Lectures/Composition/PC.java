package Lectures.Composition;

public class PC {

    private Case _case;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case _case, Monitor monitor, Motherboard motherboard) {
        this._case = _case;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        _case.powerButtonPressed();
        drawLogo();
    }

    private void drawLogo() {
        // Graphics g
        monitor.drawPixelAt(400, 400, "Blue");
    }
}
