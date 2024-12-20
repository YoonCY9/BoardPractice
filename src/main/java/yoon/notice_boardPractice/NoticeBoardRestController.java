package yoon.notice_boardPractice;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeBoardRestController {

    private final NoticeBoardService service;


    public NoticeBoardRestController(NoticeBoardService service) {
        this.service = service;
    }

    @GetMapping("/board")
    public void create(@Valid @RequestBody NoticeBoardDTO dto) {
        service.create(dto);
    }
}
