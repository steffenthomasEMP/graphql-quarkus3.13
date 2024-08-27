package my.lab;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ResultService {


  public ResultService() {
  }

  public Uni<? extends QueryResult> doSearch(String query) {
    return Uni.createFrom()
        .item(
            new LandingPageResult.LandingPageResultBuilder().id("my nice Id")
                .diagnostics(Diagnostics.builder()
                    .request("request object for query: " + query)
                    .response("response object")
                    .build()
                )
                .build()
        );
  }


}
