package my.lab;

import io.smallrye.graphql.api.federation.FieldSet;
import io.smallrye.graphql.api.federation.Key;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Key(fields = @FieldSet("id"))
public class LandingPageResult implements CategoryQueryResult, ResultBase {

  // SearchResultBase fields

  @Id
  @Getter(onMethod_={@NonNull})
  private String id;

  @Getter(onMethod_={@NonNull})
  private Diagnostics diagnostics;


  public static class LandingPageResultBuilder
      implements CategoryQueryResult.CategoryQueryResultBuilder, ResultBase.ResultBaseBuilder {
    // Lombok magic
  }


}
