package yoon.notice_boardPractice;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class NoticeBoardService {

    private final NoticeBoardRepository repository;

    public NoticeBoardService(NoticeBoardRepository repository) {
        this.repository = repository;
    }

    public void create(NoticeBoardDTO dto) {
        NoticeBoard board = new NoticeBoard(dto.getTitle());
        this.repository.save(board);
    }



}
