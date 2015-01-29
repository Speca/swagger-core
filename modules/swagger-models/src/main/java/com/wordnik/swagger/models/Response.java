package com.wordnik.swagger.models;

import com.wordnik.swagger.models.properties.Property;

import java.util.*;

public class Response {
  private String description;
  private Model schema;
  private Map<String, String> examples;
  private Map<String, Property> headers;

  public Response schema(Model property) {
    this.setSchema(property);
    return this;
  }
  public Response description(String description) {
    this.setDescription(description);
    return this;
  }
  public Response example(String type, String example) {
    if(examples == null) {
      examples = new HashMap<String, String>();
    }
    examples.put(type, example);
    return this;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public Model getSchema() {
    return schema;
  }
  public void setSchema(Model schema) {
    this.schema = schema;
  }

  public Map<String, String> getExamples() {
    return this.examples;
  }
  public void setExamples(Map<String, String> examples) {
    this.examples = examples;
  }

  public Map<String, Property> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, Property> headers) {
    this.headers = headers;
  }
}
