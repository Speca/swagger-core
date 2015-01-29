package com.wordnik.swagger.models.parameters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

public abstract class AbstractParameter implements Parameter {
  protected String in;
  protected String name;
  protected String description;
  protected boolean required = false;
  protected String access;
  private final Map<String, Object> vendorExtensions = new HashMap<String, Object>();

  protected List<String> _enum;
  protected Integer minLength = null, maxLength = null;
  protected String pattern = null;
  protected Double minimum = null, maximum = null, exclusiveMinimum = null, exclusiveMaximum = null;

  public String getIn() {
    return in;
  }
  public void setIn(String in) {
    this.in = in;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public boolean getRequired() {
    return required;
  }
  public void setRequired(boolean required) {
    this.required = required;
  }

  public String getAccess() {
    return access;
  }
  public void setAccess(String access) {
    this.access = access;
  }

//  public boolean isRequired() {
//    return required;
//  }

  public List<String> getEnum() {
    return _enum;
  }

  public void setEnum(List<String> _enum) {
    this._enum = _enum;
  }

  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public Double getMinimum() {
    return minimum;
  }
  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }

  public Double getMaximum() {
    return maximum;
  }
  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }

  public Double getExclusiveMinimum() {
    return exclusiveMinimum;
  }
  public void setExclusiveMinimum(Double exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }

  public Double getExclusiveMaximum() {
    return exclusiveMaximum;
  }
  public void setExclusiveMaximum(Double exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }

  @JsonAnyGetter
  public Map<String, Object> getVendorExtensions() {
    return vendorExtensions;
  }

  @JsonAnySetter
  public void setVendorExtension(String name, Object value) {
    if (name.startsWith("x-")) {
      vendorExtensions.put(name, value);
    }
  }
}
