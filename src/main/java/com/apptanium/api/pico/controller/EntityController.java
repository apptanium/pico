package com.apptanium.api.pico.controller;

import com.apptanium.api.pico.db.PicoDB;
import com.apptanium.api.pico.domain.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sgupta
 * @since 2/22/16.
 */
@Controller
@RequestMapping(value = "/entity/**", produces = "application/json")
public class EntityController {

  @Autowired
  PicoDB picoDB;


  @RequestMapping(value = "/{id}")
  public GenericResponse getById(@PathVariable("id")String id) {

  }




}
