package my.lab;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.NonNull;

public interface QueryResult {

  //@NonNull
  @Description("Diagnostics of the search result.")
  Diagnostics getDiagnostics();

  interface QueryResultBuilder {

    QueryResultBuilder diagnostics(Diagnostics diagnostics);

    QueryResult build();
  }
}
