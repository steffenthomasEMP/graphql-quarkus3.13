package my.lab;

public interface CategoryQueryResult extends QueryResult {
  interface CategoryQueryResultBuilder extends QueryResult.QueryResultBuilder {
    CategoryQueryResult build();
  }
}
