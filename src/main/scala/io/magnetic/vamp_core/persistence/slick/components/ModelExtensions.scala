package io.magnetic.vamp_core.persistence.slick.components

import io.magnetic.vamp_core.persistence.slick.extension.VampActiveSlick

trait ModelExtensions extends Schema
with BlueprintReferenceExtensions
with ClusterExtensions
with DefaultBlueprintExtensions
with DefaultEscalationExtensions
with DefaultFilterExtensions
with DefaultRoutingExtensions
with DefaultScaleExtensions
with DefaultSlaExtensions
with EscalationReferenceExtensions
with FilterReferenceExtensions
with RoutingReferenceExtensions
with ScaleReferenceExtensions
with ServiceExtensions
with SlaReferenceExtensions
with DefaultBreedExtensions {
  this: VampActiveSlick =>
}
