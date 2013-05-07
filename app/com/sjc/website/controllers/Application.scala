package com.sjc.website.controllers

import play.api.mvc._
import com.sjc.website.views.html._

object Application extends Controller {
  
  def index = Action {
    Ok(template(home()))
  }
  def about = Action {
    Ok(template(home()))
  }
  def events = Action {
    Ok(template(home()))
  }
  def members = TODO

  def quizz = TODO

}