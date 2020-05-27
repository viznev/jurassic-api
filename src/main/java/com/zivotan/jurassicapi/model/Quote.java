package com.zivotan.jurassicapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quote {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String text;
    private String characterId;
    private String movieId;

    public Quote(String text, String characterId, String movieId) {
        this.text = text;
        this.characterId = characterId;
        this.movieId = movieId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
