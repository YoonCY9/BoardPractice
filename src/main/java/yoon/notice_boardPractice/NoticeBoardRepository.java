package yoon.notice_boardPractice;

import org.springframework.data.jpa.repository.JpaRepository;

    public interface NoticeBoardRepository extends JpaRepository<NoticeBoard, Long> {
}
