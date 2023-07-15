package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TagsToRemove
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "id"
})
@JsonTypeName("Tags_to_remove_")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TagsToRemove {

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The id of the tag
     */
    @JsonProperty("id")
    private String id;


    @AllArgsConstructor
    public enum TypeEnum {
        TAG_REFERENCE("tag_reference");

        private final String value;
    }

}
