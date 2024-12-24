package yoon.notice_boardPractice.board;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoticeBoardRestController {

    private final NoticeBoardService service;


    public NoticeBoardRestController(NoticeBoardService service) {
        this.service = service;
    }

    @PostMapping("/boards")
    public void create(@Valid @RequestBody NoticeBoardDTO dto) {
        service.create(dto);
    }

    @GetMapping("/boards")
    public List<NoticeBoardResponse> read() {
        return service.read();
    }

    @PutMapping("/boards/{id}")
    public void update(@PathVariable Long id, @Valid @RequestBody NoticeBoardDTO dto) {
        service.update(id,dto);
    }

    @DeleteMapping("/boards/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
