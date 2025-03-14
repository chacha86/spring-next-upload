package com.example.upload.domain.post.post.service;

import com.example.upload.domain.member.member.entity.Member;
import com.example.upload.domain.post.post.dto.PostListParamDto;
import com.example.upload.domain.post.post.entity.Post;
import com.example.upload.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post write(Member author, String title, String content, boolean published, boolean listed) {

        return postRepository.save(
                Post
                        .builder()
                        .author(author)
                        .title(title)
                        .content(content)
                        .published(published)
                        .listed(listed)
                        .build()
        );
    }

    public List<Post> getItems() {
        return postRepository.findAll();
    }

    public Optional<Post> getItem(long id) {
        return postRepository.findById(id);
    }

    public long count() {
        return postRepository.count();
    }

    public void delete(Post post) {
        postRepository.delete(post);
    }

    @Transactional
    public void modify(Post post, String title, String content, boolean published, boolean listed) {
        post.setTitle(title);
        post.setContent(content);
        post.setPublished(published);
        post.setListed(listed);
    }

    public void flush() {
        postRepository.flush();
    }

    public Optional<Post> getLatestItem() {
        return postRepository.findTopByOrderByIdDesc();
    }

    public Page<Post> getItems(PostListParamDto postListParamDto) {
        Pageable pageable = PageRequest.of(postListParamDto.getPage() - 1, postListParamDto.getPageSize(), Sort.by(Sort.Direction.DESC, "id"));
        return postRepository.findByParam(postListParamDto, pageable);
    }

    public Page<Post> getMines(PostListParamDto postListParamDto, Member author) {
        Pageable pageable = PageRequest.of(postListParamDto.getPage() - 1, postListParamDto.getPageSize(), Sort.by(Sort.Direction.DESC, "id"));
        return postRepository.findByParam(postListParamDto, author, pageable);

    }
}
