package computer;

/**
 * @author agonzalezacevedo
 */
public class Computer {

    private Mouse mouse = new Mouse();
    private Screen screen = new Screen();
    private CPU CPU = new CPU();

    /**
     * Builder with parameters
     *
     * @param type this variable save type values in Computer
     * @param brand this variable save brand values in Computer
     * @param inches this variable save inches values in Computer
     * @param speed this variable save speed values in Computer
     * @param memory this variable save memory values in Computer
     */
    public Computer(String type, String brand, float inches, int speed, int memory) {
        mouse = new Mouse(type);
        screen = new Screen(brand, inches);
        CPU = new CPU(speed, memory);
    }

    /**
     * Builder without parameters
     */
    public Computer() {

    }

    /**
     * It's a method to set values to type
     *
     * @param type this variable save type values in Computer
     */
    public void setMouse(String type) {
        mouse = new Mouse(type);
    }

    /**
     * It's a method to set values to brand and inches
     *
     * @param brand this variable save brand values in Computer
     * @param inches this variable save inches values in Computer
     */
    public void setScreen(String brand, float inches) {
        screen = new Screen(brand, inches);
    }

    /**
     * It's a method to set values to speed and memory
     *
     * @param speed this variable save speed values in Computer
     * @param memory this variable save memory values in Computer
     */
    public void setCPU(int speed, int memory) {
        CPU = new CPU(speed, memory);
    }

    /**
     * It's a method to get values of mouse
     *
     * @return mouse this variable save mouse values in Computer
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     * It's a method to get values of screen
     *
     * @return screen this variable save screen values in Computer
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * It's a method to get values of CPU
     *
     * @return CPU this variable save CPU values in Computer
     */
    public CPU getCPU() {
        return CPU;
    }

    public void show() {
        System.out.println("Mouse:" + mouse.getType() + "\nScreen: \nBrand:" + screen.getBrand() + "\nInches:" + screen.getInches() + "\nCPU:\nSpeed:" + CPU.getSpeed() + "\nMemory:" + CPU.getMemory());
    }
}
