package computer;

/**
 * @author agonzalezacevedo
 */
public class Mouse {

    private String type;

    /**
     * Builder with parameters
     *
     * @param type this variable save type values of Mouse
     */
    public Mouse(String type) {
        this.type = type;
    }

    /**
     * Builder without parameters
     */
    public Mouse() {

    }

    /**
     * It's a method to set values to type
     *
     * @param type this variable save type values of Mouse
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * It's a method to get values of type
     *
     * @return type this variable save type values of Mouse
     */
    public String getType() {
        return type;
    }
}
