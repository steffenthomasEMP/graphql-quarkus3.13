package my.lab;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Diagnostics {

  @NonNull
  @Description("the REST request sent")
  private String request;

  @NonNull
  @Description("the REST response received")
  private String response;
}
