package com.smartidea.parssitems.controllers;

import com.smartidea.parssitems.services.MkServiceImpl;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("")
public class ParsSiteMSController {
    private final MkServiceImpl mkServiceImpl;

    public ParsSiteMSController(MkServiceImpl mkServiceImpl) {
        this.mkServiceImpl = mkServiceImpl;
    }
    @GetMapping("")
    public Document controller() {
        return mkServiceImpl.getDocument();
    }
}
