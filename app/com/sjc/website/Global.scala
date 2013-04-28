package com.sjc.website

import com.sjc.website.quizz.{Quizzes, Quizz}
import scala.slick.driver.H2Driver.simple._
import play.api.db.DB
import play.api.{Application, GlobalSettings}

object Global  extends GlobalSettings{

  override def onStart(app: Application) {
    lazy val database = Database.forDataSource(DB.getDataSource()(app))
    database withSession {
    }
  }
}
