package io.magnetic.vamp_core.persistence.slick.model

object ParameterType extends Enumeration {
  type ParameterType = Value
  val String, Int, Double = Value
}