package controllers

/**
 * Created by jthomas on 11/11/15.
 */

import play.api.mvc.{Controller, Action}

object Items extends Controller {
  val shop = models.Shop // Refer to your Shop implmentation
  val list = Action { NotImplemented }
  val create = Action { NotImplemented }
  def details(id: Long) = Action { NotImplemented }
  def update(id: Long) = Action { NotImplemented }
  def delete(id: Long) = Action { NotImplemented }
}
