package com.leandroinacio.domain;

import java.io.Serializable;
import java.util.HashMap;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

/**
 * A Book.
 */
@org.springframework.data.mongodb.core.mapping.Document(collection = "book")
public class Book extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    private String author;

    HashMap<Enum<Languages>, String> titles;

  	public Book() {}

    public Book(String id, String author, HashMap<Enum<Languages>,String> titles) {
      this.id = id;
      this.author = author;
      this.titles = titles;
    }

    public String getId() {
      return this.id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getAuthor() {
      return this.author;
    }

    public void setAuthor(String author) {
      this.author = author;
    }

    public HashMap<Enum<Languages>,String> getTitles() {
      return this.titles;
    }

    public void setTitles(HashMap<Enum<Languages>,String> titles) {
      this.titles = titles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        return id != null && id.equals(((Book) o).id);
    }

    @Override
    public int hashCode() {
      return getClass().hashCode();
    }

    @Override
    public String toString() {
      return "{" +
        " id='" + getId() + "'" +
        ", author='" + getAuthor() + "'" +
        ", titles='" + getTitles() + "'" +
        "}";
    }
}
