package com.sjc.website.controllers

import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(com.sjc.website.views.html.index())
  }
  
}