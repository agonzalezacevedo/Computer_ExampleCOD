package computer;

/**
 * @author agonzalezacevedo
 */
public class CPU {

    private int speed;
    private int memory;

    /**
     * Builder with parameters
     *
     * @param speed this variable save speed values of CPU
     * @param memory this variable save memory values of CPU
     */
    public CPU(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }

    /**
     * Builder without parameters
     */
    public CPU() {

    }

    /**
     * It's to set values to speed
     *
     * @param speed this variable save speed values of CPU
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * It's to set values to memory
     *
     * @param memory this variable save memory values of CPU
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * It's a method to get values of inches
     *
     * @return speed this variable save speed values of CPU
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * It's a method to get values of memory
     *
     * @return memory this variable save memory values of CPU
     */
    public int getMemory() {
        return memory;

    }
}
