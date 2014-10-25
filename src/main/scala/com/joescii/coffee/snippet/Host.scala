package com.joescii.coffee.snippet

import net.liftweb.util.Helpers._
import java.net.InetAddress

object Host {
  def render = "*" #> InetAddress.getLocalHost.getHostAddress
}
