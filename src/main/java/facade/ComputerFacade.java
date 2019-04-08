package facade;

public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDriver hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDriver();
    }

    public void start() {
        processor.freeze();
        ram.load(0, hd.read(0, 8));
        processor.jump(0);
        processor.execute();
    }
}
