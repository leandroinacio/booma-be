package com.leandroinacio.repository;

import com.leandroinacio.domain.Book;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link Book} entity.
 */
@Repository
public interface BookRepository extends MongoRepository<Book, String> {
    // String USERS_BY_LOGIN_CACHE = "usersByLogin";

    // String USERS_BY_EMAIL_CACHE = "usersByEmail";

    // Optional<User> findOneByActivationKey(String activationKey);

    // List<User> findAllByActivatedIsFalseAndActivationKeyIsNotNullAndCreatedDateBefore(Instant dateTime);

    // Optional<User> findOneByResetKey(String resetKey);

    // @Cacheable(cacheNames = USERS_BY_EMAIL_CACHE)
    // Optional<User> findOneByEmailIgnoreCase(String email);

    // @Cacheable(cacheNames = USERS_BY_LOGIN_CACHE)
    // Optional<User> findOneByLogin(String login);

    // Page<User> findAllByIdNotNullAndActivatedIsTrue(Pageable pageable);
}
