package yoon.notice_boardPractice;

import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void create(PostDTO dto) {
        Post post = new Post(dto.getUserNickName(), dto.getTitle(), dto.getDetail());
        postRepository.save(post);
    }
}
