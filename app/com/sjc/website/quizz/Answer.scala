package com.sjc.website.quizz

import scala.slick.driver.H2Driver.simple._
import scala.slick.lifted.ForeignKeyAction

case class Answer(id: Option[Int] = None, content: String, questionId: Int)

object Answers extends Table[Answer]("Answer") {
  def id = column[Int]("id", O.PrimaryKey, O AutoInc) // This is the primary key column
  def content = column[String]("content", O NotNull)
  def questionId = column[Int]("question")

  def question = foreignKey("QUESTION_ANSWER_FK", questionId, Questions)(_.id, onDelete = ForeignKeyAction.Cascade)

  def * = id.? ~ content ~ questionId <> (Answer, Answer.unapply _)
}