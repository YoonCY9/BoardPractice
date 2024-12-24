package yoon.notice_boardPractice.board;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<NoticeBoardResponse> read() {
        List<NoticeBoard> boards = repository.findAll();
        return boards.stream().map(board -> new NoticeBoardResponse(board.getId(), board.getTitle())).toList();
    }

    public void update(Long id, NoticeBoardDTO dto) {
        NoticeBoard board = repository.findById(id).orElseThrow();
        board.setTitle(dto.getTitle());
        NoticeBoard updateBoard = repository.save(board);
        new NoticeBoardResponse(updateBoard.getId(), updateBoard.getTitle());
    }

    public void delete(Long id) {
        NoticeBoard board = repository.findById(id).orElseThrow();
        repository.deleteById(board.getId());
    }
}
