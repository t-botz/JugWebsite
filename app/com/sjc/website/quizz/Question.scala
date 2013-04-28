package com.sjc.website.quizz

import scala.slick.driver.H2Driver.simple._
import scala.slick.lifted.ForeignKeyAction

case class Question(id: Option[Int] = None, quizzId: Int, content: String, nextQuestion : Option[Int])

object Questions extends Table[Question]("Question") {
  def id = column[Int]("id", O.PrimaryKey, O AutoInc) // This is the primary key column
  def quizzId = column[Int]("quizz", O NotNull)
  def content = column[String]("content")
  def nextQuestion = column[Int]("nextQuestion")

  def quizz = foreignKey("QUIZZ_QUESTION_FK", quizzId, Quizzes)(_.id, onDelete = ForeignKeyAction.Cascade)
  def * = id.? ~ quizzId ~ content ~ nextQuestion.? <> (Question, Question.unapply _)
}