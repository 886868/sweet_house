package com.mrle.contorller;

import com.mrle.entity.Color;
import com.mrle.entity.DemoEntity;
import com.mrle.entity.Type;
import com.mrle.service.DemoEntityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/demo")
public class TestController {

    private DemoEntityService demoEntityService;

    public TestController(DemoEntityService demoEntityService) {
        this.demoEntityService = demoEntityService;
    }

    @RequestMapping("/save")
    public ResponseEntity save() {

        DemoEntity entity = new DemoEntity();

        entity.setType(Type.RED);
        return new ResponseEntity<>(demoEntityService.save(entity), HttpStatus.OK);
    }


    @RequestMapping("/find/{id}")
    public ResponseEntity find(@RequestParam("id") Integer id) {

        return new ResponseEntity<>(demoEntityService.findBySeq(id), HttpStatus.OK);
    }
}
