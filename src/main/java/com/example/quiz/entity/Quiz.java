package com.example.quiz.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "quiz")
public class Quiz {
	/** 識別ID */
	@Id
	private Integer id;
	/** クイズの内容 */
	private String question;
	/** クイズの解答 */
	private Boolean answer;
	/** 作成者 */
	private String author;
}
