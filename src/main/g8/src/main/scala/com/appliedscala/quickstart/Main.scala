package com.appliedscala.quickstart

import com.typesafe.scalalogging.Logger

object Main {
  private val log = Logger("Main")

  def main(args: Array[String]): Unit = {
    log.info("Starting the application")
    println("Hello World!")
  }
}
