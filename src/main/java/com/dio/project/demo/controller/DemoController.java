package com.dio.project.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.project.demo.model.DemoModel;

@RestController
@RequestMapping("/firstRoute")
public class DemoController {

  @GetMapping("/")
  public String firstMsg() {
    return "Certinho";
  }

  @PostMapping("/")
  public void create(@RequestBody DemoModel demoModel) {
    System.out.println(demoModel.getUsername());
  }
}
