package com.vcarstein.WebBlog.repos;

import com.vcarstein.WebBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
