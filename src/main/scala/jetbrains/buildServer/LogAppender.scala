package jetbrains.buildServer

import sbt._


trait LogAppender {

  def log(level: sbt.Level.Value, message: => String, flowId: String)

  def compilationBlockStart()

  def compilationBlockEnd()

  def testSuitStart(name: String, flowId: String)

  def testSuitSuccessfulResult(name: String, flowId: String)
  
  def testSuitFailResult(name: String, t: Throwable, flowId: String)

  def testEventOccurred(event: TestEvent, flowId: String)
}