package model
import play.api.libs.json._
// please note we don't import functional.syntax._ as it is managed by the macro itself
case class Itemb ( val name: String,
              val brand: String,
              val color: String,
              val size: String,
             var price: Double=0
            )
object Itemb {
  implicit val readItem = Json.format[Itemb]

  implicit val writeItem = Json.writes[Itemb]

}


