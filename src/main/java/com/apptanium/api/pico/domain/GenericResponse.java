package com.apptanium.api.pico.domain;

import java.util.List;

/**
 * @author sgupta
 * @since 2/22/16.
 */
public class GenericResponse {

  public Status status;
  public String error;

  public List<Entity> data;
  public int count;
  public String next;
  public String prev;
}
