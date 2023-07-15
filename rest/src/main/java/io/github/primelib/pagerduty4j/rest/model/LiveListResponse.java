package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LiveListResponse
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "limit",
    "more"
})
@JsonTypeName("LiveListResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LiveListResponse {

    /**
     * Echoes limit pagination property.
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * Indicates if there are additional records to return
     */
    @JsonProperty("more")
    private Boolean more;


}
