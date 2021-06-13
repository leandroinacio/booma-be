package com.leandroinacio.repository;

import com.leandroinacio.domain.Sentence;
// import java.time.Instant;
// import java.util.List;
// import java.util.Optional;
// import org.springframework.cache.annotation.Cacheable;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link Sentence} entity.
 */
@Repository
public interface SentenceRepository extends MongoRepository<Sentence, String> {
    String USERS_BY_LOGIN_CACHE = "usersByLogin";

    List<User> findAllByActivatedIsFalseAndActivationKeyIsNotNullAndCreatedDateBefore(Instant dateTime);

    Page<User> findAllByIdNotNullAndActivatedIsTrue(Pageable pageable);
}
