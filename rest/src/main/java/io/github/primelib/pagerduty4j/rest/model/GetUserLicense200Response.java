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
 * GetUserLicense200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "license"
})
@JsonTypeName("getUserLicense_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserLicense200Response {

    @JsonProperty("license")
    private ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense license;


}
