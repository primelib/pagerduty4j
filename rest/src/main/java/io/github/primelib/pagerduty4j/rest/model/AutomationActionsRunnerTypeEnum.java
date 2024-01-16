package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AutomationActionsRunnerTypeEnum
 * 
 *
 */
@JsonTypeName("AutomationActionsRunnerTypeEnum")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum AutomationActionsRunnerTypeEnum {
    SIDECAR("sidecar"),
    RUNBOOK("runbook");

    private final String value;
}
