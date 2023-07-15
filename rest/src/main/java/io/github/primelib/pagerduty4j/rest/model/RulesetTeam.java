package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RulesetTeam
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "type",
    "self"
})
@JsonTypeName("Ruleset_team")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RulesetTeam {

    @JsonProperty("id")
    private String id;

    /**
     * A string that determines the schema of the object
     */
    @JsonProperty("type")
    private String type;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;


}
