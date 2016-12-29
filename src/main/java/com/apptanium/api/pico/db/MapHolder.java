package com.apptanium.api.pico.db;

import com.apptanium.api.pico.domain.Entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sgupta
 * @since 2/22/16.
 */
class MapHolder {
  final Map<String,Entity> map = new HashMap<>(256);
}
