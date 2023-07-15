package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowActionAllOfOutputs
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "description",
    "type"
})
@JsonTypeName("IncidentWorkflowAction_allOf_outputs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowActionAllOfOutputs {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowActionAllOfOutputs}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowActionAllOfOutputs(Consumer<IncidentWorkflowActionAllOfOutputs> spec) {
        spec.accept(this);
    }

    /**
     * The name of the Output
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    /**
     * The data type produced by this Output
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The data type produced by this Output
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TEXT("text"),
        PASSWORD("password"),
        INTEGER("integer"),
        DECIMAL("decimal"),
        DATE("date"),
        DATETIME("dateTime"),
        BOOLEAN("boolean"),
        SINGLECHOICE("singleChoice"),
        MULTIPLECHOICE("multipleChoice"),
        JSON("json");

        private final String value;
    }

}
