package computer;

/**
 * @author agonzalezacevedo
 */
public class Screen {

    private String Brand;
    private float Inches;

    /**
     * Builder with parameters
     *
     * @param brand this variable save brand values of Screen
     * @param inches this variable save inches values of Screen
     */
    public Screen(String brand, float inches) {
        this.Brand = brand;
        this.Inches = inches;

    }

    /**
     * Builder without parameters
     */
    public Screen() {

    }

    /**
     * It's a method to set values to brand
     *
     * @param Brand this variable save brand values of Screen
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * It's a method to set values to inches
     *
     * @param Inches this variable save inches values of Screen
     */
    public void setInches(float Inches) {
        this.Inches = Inches;
    }

    /**
     * It's a method to get values of brand
     *
     * @return Brand this variable save brand values of Screen
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * It's a method to get values of inches
     *
     * @return Inches this variable save inches values of Screen
     */
    public float getInches() {
        return Inches;
    }
}
