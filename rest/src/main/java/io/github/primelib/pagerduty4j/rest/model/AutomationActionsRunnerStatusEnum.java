package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AutomationActionsRunnerStatusEnum
 * 
 *
 */
@JsonTypeName("AutomationActionsRunnerStatusEnum")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum AutomationActionsRunnerStatusEnum {
    CONFIGURED("Configured"),
    NOTCONFIGURED("NotConfigured");

    private final String value;
}
