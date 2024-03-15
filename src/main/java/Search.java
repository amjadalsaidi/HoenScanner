import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
    @JsonProperty("city")
    private String city;

    // Default constructor
    public Search() {
    }

    // Parameterized constructor
    public Search(String city) {
        this.city = city;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }
}
