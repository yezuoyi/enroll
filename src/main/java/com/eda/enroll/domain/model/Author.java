package com.eda.enroll.domain.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
    
    @Id
    @GeneratedValue
    private Long id;
    
    /**作者的名字*/
    @Column(length=32)
    private String name;
    
    /**作者写的书*/
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="author")//级联保存、更新、删除、刷新;延迟加载
    private Set<Book> books = new HashSet<Book>();
    
    
    
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Set<Book> getBooks() {
        return books;
    }


    public void setBooks(Set<Book> books) {
        this.books = books;
    }


    
    
}