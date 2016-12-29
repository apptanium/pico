package com.apptanium.api.pico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sgupta
 * @since 11/17/16.
 */
@Controller
@RequestMapping(value = "/query/**", produces = "application/json")
public class QueryController {

}
