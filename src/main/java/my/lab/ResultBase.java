package my.lab;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.NonNull;

public interface ResultBase extends QueryResult {

  @NonNull
  String getId();

  interface ResultBaseBuilder extends QueryResultBuilder {

    ResultBaseBuilder id(String id);

    ResultBase build();
  }
}
