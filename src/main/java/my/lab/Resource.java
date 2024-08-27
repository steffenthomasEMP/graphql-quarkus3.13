package my.lab;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class Resource {

  @Inject
  ResultService service;

  @Query
  @Description("do a search")
  public Uni<@NonNull ? extends QueryResult> search(@NonNull String query) {
    return this.service.doSearch(query);
  }

}
