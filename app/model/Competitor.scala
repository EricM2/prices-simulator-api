package model

import play.api.libs.json.Json

case class Competitor(timestamp: String,name: String,itemb: Itemb)
object Competitor {
  implicit val readItem = Json.format[Competitor]

  implicit val writeItem = Json.writes[Competitor]

}
