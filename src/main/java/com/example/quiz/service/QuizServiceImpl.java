package com.example.quiz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz.entity.Quiz;
import com.example.quiz.repository.Quizrepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class QuizServiceImpl implements QuizService {
	@Autowired
	Quizrepository repository;
	@Override
	public Iterable<Quiz> selectAll() {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findAll();
	}

	@Override
	public Optional<Quiz> selectOneById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findById(id);
	}

	@Override
	public Optional<Quiz> selectOneRandamQuiz() {
		// TODO 自動生成されたメソッド・スタブ
		Integer randId = repository.getRandomId();
		//ランダムでidの値を取得する
		if (randId == null) {
			//問題ない場合
			return Optional.empty();
		}
		return repository.findById(randId);
	}

	@Override
	public Boolean checkQuiz(Integer id, Boolean myAnswer) {
		// TODO 自動生成されたメソッド・スタブ
		//クイズの正解不正解を判定用変数
		Boolean check = false;
		//大砲のクイズを取得
		Optional<Quiz> optQuiz = repository.findById(id);
		//値存在チェック
		if (optQuiz.isPresent()) {
			Quiz quiz = optQuiz.get();
			//クイズの回答をチェック
			if (quiz.getAuthor().equals(myAnswer)) {
				check = true;
			}
		}
		return check;
	}

	@Override
	public void insertQuiz(Quiz quiz) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(quiz);

	}

	@Override
	public void updateQuiz(Quiz quiz) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(quiz);

	}

	@Override
	public void deleteQuizById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		repository.deleteById(id);

	}

}
