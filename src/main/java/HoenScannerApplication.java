import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

import java.util.ArrayList;
import java.util.List;

public class HoenScannerApplication extends Application<HoenScannerConfiguration> {
    public static void main(String[] args) throws Exception {
        new HoenScannerApplication().run(args);
    }

    @Override
    public void run(HoenScannerConfiguration configuration, Environment environment) throws Exception {
        // Load JSON files into a single list of search results
        List<SearchResult> searchResults = loadSearchResults();

        // Register SearchResource with the loaded search results
        environment.jersey().register(new SearchResource(searchResults));
    }

    private List<SearchResult> loadSearchResults() {
        // Implement logic to load JSON files into a single list of search results
        // You'll need to use a JSON parser library like Jackson
        // For demonstration purposes, let's assume searchResults is a List<SearchResult>
        List<SearchResult> searchResults = new ArrayList<>();
        // Add logic to load data from JSON files here
        return searchResults;
    }
}
