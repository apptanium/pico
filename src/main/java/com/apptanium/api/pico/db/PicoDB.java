package com.apptanium.api.pico.db;

import com.apptanium.api.pico.domain.Entity;
import com.apptanium.api.pico.domain.GenericResponse;
import com.apptanium.api.pico.domain.Query;

import java.util.*;

/**
 * @author sgupta
 * @since 2/22/16.
 */
public class PicoDB {
  private static final int CAPACITY = 31;

  private static final Object LOCK = new Object();
  private static final PicoDB INSTANCE = new PicoDB();

  private final MapHolder[] holders = new MapHolder[CAPACITY];
  private final List<EntityHolder> list = new LinkedList<>();



  private PicoDB() {
    for (int i = 0; i < CAPACITY; i++) {
      holders[i] = new MapHolder();
    }
  }

  public void put(Entity entity) {
    synchronized (LOCK) {
      holders[Math.abs(entity.hashCode() % CAPACITY)].map.put(entity.getId(), entity);
    }
  }

  public Entity get(String id) {
    return holders[Math.abs(id.hashCode() % CAPACITY)].map.get(id);
  }

  public GenericResponse find(Query query) {
    return null;
  }

  public static PicoDB getInstance() {
    return INSTANCE;
  }
}
