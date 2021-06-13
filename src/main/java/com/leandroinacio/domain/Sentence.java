package com.leandroinacio.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A Sentence.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "sentence")
public class Sentence extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

  	@NotNull
	  private String book;

    @NotNull
    private Long page;

    @NotNull
    private Long order;

    @Field("sentences")
    HashMap<Enum<Languages>, List<String>> sentence;

    public Sentence() {}

    public Sentence(String id, String book, Long page, Long order, HashMap<Enum<Languages>, List<String>> sentence) {
      this.id = id;
      this.book = book;
      this.page = page;
      this.order = order;
      this.sentence = sentence;
    }

    public String getId() {
      return this.id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getBook() {
      return this.book;
    }

    public void setBook(String book) {
      this.book = book;
    }

    public Long getPage() {
      return this.page;
    }

    public void setPage(Long page) {
      this.page = page;
    }

    public Long getOrder() {
      return this.order;
    }

    public void setOrder(Long order) {
      this.order = order;
    }

    public HashMap<Enum<Languages>,List<String>> getSentence() {
      return this.sentence;
    }

    public void setSentence(HashMap<Enum<Languages>,List<String>> sentence) {
      this.sentence = sentence;
    }

    public Sentence id(String id) {
      setId(id);
      return this;
    }

    public Sentence book(String book) {
      setBook(book);
      return this;
    }

    public Sentence page(Long page) {
      setPage(page);
      return this;
    }

    public Sentence order(Long order) {
      setOrder(order);
      return this;
    }

    public Sentence sentence(HashMap<Enum<Languages>,List<String>> sentence) {
      setSentence(sentence);
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this)
        return true;
      if (!(o instanceof Sentence)) {
        return false;
      }
      Sentence sentence = (Sentence) o;
      return id != null && id.equals(sentence.getId());
    }

    @Override
    public int hashCode() {
      return getClass().hashCode();
    }

    @Override
    public String toString() {
      return "{" +
        " id='" + getId() + "'" +
        ", book='" + getBook() + "'" +
        ", page='" + getPage() + "'" +
        ", order='" + getOrder() + "'" +
        ", sentence='" + getSentence() + "'" +
        "}";
    }
}
