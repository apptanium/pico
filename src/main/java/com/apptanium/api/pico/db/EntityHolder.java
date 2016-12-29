package com.apptanium.api.pico.db;

import com.apptanium.api.pico.domain.Entity;

/**
 * @author sgupta
 * @since 2/22/16.
 */
class EntityHolder {
  private Entity entity;


  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public boolean hasEntity() {
    return entity != null;
  }
}
