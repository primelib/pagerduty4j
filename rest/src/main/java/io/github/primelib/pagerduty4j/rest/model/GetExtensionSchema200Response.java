package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetExtensionSchema200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "extension_schema"
})
@JsonTypeName("getExtensionSchema_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetExtensionSchema200Response {

    @JsonProperty("extension_schema")
    private ExtensionSchema extensionSchema;


}
