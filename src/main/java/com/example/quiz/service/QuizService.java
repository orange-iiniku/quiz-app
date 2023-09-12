package com.example.quiz.service;

import java.util.Optional;

import com.example.quiz.entity.Quiz;

/** Quizeサービス処理 */
public interface QuizService {
	/** クイズ情報を全件取得 */
	Iterable<Quiz> selectAll();
	/** クイズ情報を、IDをキーに1件取得 */
	Optional<Quiz> selectOneById(Integer id);
	/** クイズ情報をランダムで1件取得 */
	Optional<Quiz> selectOneRandamQuiz();
	/** クイズの正解不正解を判定 */
	Boolean checkQuiz(Integer id, Boolean myAnswer);
	/** クイズを登録します */
	void insertQuiz(Quiz quiz);
	/** クイズを更新します */
	void updateQuiz(Quiz quiz);
	/** クイズを削除します
	 *  */
	void deleteQuizById(Integer id);
}
