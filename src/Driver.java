import java.util.Objects;

public class Driver {
    private String driver;

    public Driver(String driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver1 = (Driver) o;
        return Objects.equals(driver, driver1.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver);
    }
}
