package com.sjc.website.quizz

import scala.slick.driver.H2Driver.simple._

case class Quizz(id: Option[Int] = None, name: String)

object Quizzes extends Table[Quizz]("Quizz") {
  def id = column[Int]("id", O.PrimaryKey, O AutoInc) // This is the primary key column
  def name = column[String]("name")

  def * = id.? ~ name <> (Quizz, Quizz.unapply _)
}