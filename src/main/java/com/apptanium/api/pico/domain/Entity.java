package com.apptanium.api.pico.domain;

import java.io.Serializable;

/**
 * @author sgupta
 * @since 2/22/16.
 */
public class Entity implements Serializable {
  private static final long serialVersionUID = -159412604686053926L;

  private final String id;


  public Entity(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Entity entity = (Entity) o;

    return id.equals(entity.id);

  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }
}
