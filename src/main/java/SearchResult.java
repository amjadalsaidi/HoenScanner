import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/search")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SearchResource {
    private List<SearchResult> searchResults; // This should be populated in HoenScannerApplication

    public SearchResource(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    @POST
    public List<SearchResult> search(Search search) {
        // Implement logic to filter searchResults based on the search object
        // and return the filtered results
        return searchResults;
    }
}
