package com.inacio.booma.domain;

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

	public Book id(String id) {
		setId(id);
		return this;
	}

	public Book author(String author) {
		setAuthor(author);
		return this;
	}

	public Book titles(HashMap<Enum<Languages>,String> titles) {
		setTitles(titles);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Book)) {
			return false;
		}
		Book book = (Book) o;
		return this.id != null && this.id.equals(book.getId());
	}

	@Override
	public int hashCode() {
		return 31;
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
