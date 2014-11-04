package com.joescii.coffee.snippet

import net.liftweb.http._
import js._
import JsCmds._
import JE._
import net.liftweb.util.Helpers._
import com.joescii.coffee.comet.Presentation
import com.joescii.coffee.comet.Presentation.Ask

object PresentationState {
  def render = "*" #> Script(
    JsCrVar("PresentationState", JsObj()) &
      SetExp(JsVar("PresentationState.initMe"), AnonFunc(JsReturn(SHtml.ajaxInvoke({() =>
        (Presentation !! Ask).map { case id:String =>
          Call("window.Presentation.goto", id):JsCmd
        }.openOr(Noop)
      }))))
  )
}
