import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {
    @JsonProperty("city")
    private String city;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("title")
    private String title;

    // Default constructor
    public SearchResult() {
    }

    // Parameterized constructor
    public SearchResult(String city, String kind, String title) {
        this.city = city;
        this.kind = kind;
        this.title = title;
    }

    // Getters and setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
