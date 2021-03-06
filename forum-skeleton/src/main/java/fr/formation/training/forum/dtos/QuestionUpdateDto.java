package fr.formation.training.forum.dtos;

import javax.validation.constraints.*;

public class QuestionUpdateDto {

    @NotBlank
    @Size(max = 255)
    private String phrase;

    @NotBlank
    @Size(max = 1000)
    private String text;

    @NotNull
    @Positive
    private Long technologyId;

    public Long getTechnologyId() {
	return technologyId;
    }

    public void setTechnologyId(Long technologyId) {
	this.technologyId = technologyId;
    }

    public String getPhrase() {
	return phrase;
    }

    public void setPhrase(String phrase) {
	this.phrase = phrase;
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }
}
